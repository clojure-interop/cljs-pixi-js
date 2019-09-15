(ns pixi.core.Filter
  "Extends - Shader.

  Filter is a special type of WebGL shader that is applied to the
  {@link http://pixijs.io/examples/#/filters/blur-filter.js Example}
  the
  {@link PIXI.filters.BlurFilter BlurFilter}.
  ### Usage
  Filters can be applied to any DisplayObject or Container.
  PixiJS' `FilterSystem` renders the container into temporary Framebuffer,
  then filter renders it to the screen.
  Multiple filters can be added to the `filters` array property
  stacked on each other.
  ```
  const filter = new PIXI.Filter(myShaderVert, myShaderFrag, {
  0.5 });
  const container = new PIXI.Container();
  container.filters = [filter];
  ```
  ### Previous Version Differences
  In PixiJS **v3**, a filter was always applied to _whole screen_.
  In PixiJS **v4**, a filter can be applied _only part of the screen_.
  Developers had to create a set of uniforms to deal with coordinates.
  In PixiJS **v5** combines _both approaches_.
  Developers can use normal coordinates of v3 and then allow filter
  use partial Framebuffers,
  bringing those extra uniforms into account.
  Also be aware that we have changed default vertex shader, please
  {@link https://github.com/pixijs/pixi.js/wiki/v5-Creating-filters
  ### Built-in Uniforms
  PixiJS viewport uses screen (CSS) coordinates, `(0, 0, renderer.screen.width,
  and `projectionMatrix` uniform maps it to the gl viewport.
  **uSampler**
  The most important uniform is the input texture that container
  rendered into.
  _Important note: as with all Framebuffers in PixiJS, both input
  output are
  premultiplied by alpha._
  By default, input normalized coordinates are passed to fragment
  with `vTextureCoord`.
  Use it to sample the input.
  ```
  const fragment = `
  varying vec2 vTextureCoord;
  uniform sampler2D uSampler;
  void main(void)
  {
  gl_FragColor = texture2D(uSampler, vTextureCoord);
  }
  `;
  const myFilter = new PIXI.Filter(null, fragment);
  ```
  This filter is just one uniform less than {@link PIXI.filters.AlphaFilter
  **outputFrame**
  The `outputFrame` holds the rectangle where filter is applied
  screen (CSS) coordinates.
  It's the same as `renderer.screen` for a fullscreen filter.
  Only a part of `outputFrame.zw` size of temporary Framebuffer
  used,
  `(0, 0, outputFrame.width, outputFrame.height)`,
  Filters uses this quad to normalized (0-1) space, its passed
  `aVertexPosition` attribute.
  To calculate vertex position in screen space using normalized
  space:
  ```
  vec4 filterVertexPosition( void )
  {
  vec2 position = aVertexPosition * max(outputFrame.zw, vec2(0.))
  outputFrame.xy;
  return vec4((projectionMatrix * vec3(position, 1.0)).xy, 0.0,
  }
  ```
  **inputSize**
  Temporary framebuffer is different, it can be either the size
  screen, either power-of-two.
  The `inputSize.xy` are size of temporary framebuffer that holds
  The `inputSize.zw` is inverted, it's a shortcut to evade division
  the shader.
  Set `inputSize.xy = outputFrame.zw` for a fullscreen filter.
  To calculate input normalized coordinate, you have to map it
  filter normalized space.
  Multiply by `outputFrame.zw` to get input coordinate.
  Divide by `inputSize.xy` to get input normalized coordinate.
  ```
  vec2 filterTextureCoord( void )
  {
  return aVertexPosition * (outputFrame.zw * inputSize.zw); //
  as /inputSize.xy
  }
  ```
  **resolution**
  The `resolution` is the ratio of screen (CSS) pixels to real
  **inputPixel**
  `inputPixel.xy` is the size of framebuffer in real pixels, same
  `inputSize.xy * resolution`
  `inputPixel.zw` is inverted `inputPixel.xy`.
  It's handy for filters that use neighbour pixels, like {@link
  FXAAFilter}.
  **inputClamp**
  If you try to get info from outside of used part of Framebuffer
  you'll get undefined behaviour.
  For displacements, coordinates has to be clamped.
  The `inputClamp.xy` is left-top pixel center, you may ignore
  because we use left-top part of Framebuffer
  `inputClamp.zw` is bottom-right pixel center.
  ```
  vec4 color = texture2D(uSampler, clamp(modifigedTextureCoord,
  inputClamp.zw))
  ```
  OR
  ```
  vec4 color = texture2D(uSampler, min(modifigedTextureCoord, inputClamp.zw))
  ```
  ### Additional Information
  Complete documentation on Filter usage is located in the
  {@link https://github.com/pixijs/pixi.js/wiki/v5-Creating-filters
  Since PixiJS only had a handful of built-in filters, additional
  can be downloaded
  {@link https://github.com/pixijs/pixi-filters here} from the
  Filters repository."
  (:refer-clojure :exclude [apply]))

(defn new
  "Constructor."
  ([]
    (new js/Filter))
  ([vertex-src]
    (new js/Filter vertex-src))
  ([vertex-src fragment-src]
    (new js/Filter vertex-src fragment-src))
  ([vertex-src fragment-src uniforms]
    (new js/Filter vertex-src fragment-src uniforms)))

(defn apply
  "Method.

  Member of Filter.

  Applies the filter"
  ([this filter-manager input output clear]
    (-> this (.apply filter-manager input output clear)))
  ([this filter-manager input output clear current-state]
    (-> this (.apply filter-manager input output clear current-state))))

(defn *from
  "Method.

  Member of Filter.

  A short hand function to create a shader based of a vertex and
  shader"
  ([]
    (-> js/Shader (.from)))
  ([vertex-src]
    (-> js/Shader (.from vertex-src)))
  ([vertex-src fragment-src]
    (-> js/Shader (.from vertex-src fragment-src)))
  ([vertex-src fragment-src uniforms]
    (-> js/Shader (.from vertex-src fragment-src uniforms))))

(defn source-key-map
  "Property.

  Member of Filter.

  Used for caching shader IDs"
  []
  (-> js/Filter .-SOURCE_KEY_MAP))

(defn set-source-key-map!
  "Property.

  Member of Filter.

  Used for caching shader IDs"
  [val]
  (aset js/Filter "SOURCE_KEY_MAP" val))

(defn auto-fit
  "Property.

  Member of Filter.

  If enabled, PixiJS will fit the filter area into boundaries for
  performance.
  Switch it off if it does not work for specific shader."
  [this]
  (-> this .-autoFit))

(defn set-auto-fit!
  "Property.

  Member of Filter.

  If enabled, PixiJS will fit the filter area into boundaries for
  performance.
  Switch it off if it does not work for specific shader."
  [this val]
  (aset this "autoFit" val))

(defn blend-mode
  "Property.

  Member of Filter.

  Sets the blendmode of the filter"
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of Filter.

  Sets the blendmode of the filter"
  [this val]
  (aset this "blendMode" val))

(defn enabled
  "Property.

  Member of Filter.

  If enabled is true the filter is applied, if false it will not."
  [this]
  (-> this .-enabled))

(defn set-enabled!
  "Property.

  Member of Filter.

  If enabled is true the filter is applied, if false it will not."
  [this val]
  (aset this "enabled" val))

(defn legacy
  "Property.

  Member of Filter.

  Legacy filters use position and uvs from attributes"
  [this]
  (-> this .-legacy))

(defn set-legacy!
  "Property.

  Member of Filter.

  Legacy filters use position and uvs from attributes"
  [this val]
  (aset this "legacy" val))

(defn padding
  "Property.

  Member of Filter.

  The padding of the filter. Some filters require extra space to
  such as a blur.
  Increasing this will add extra width and height to the bounds
  the object that the
  filter is applied to."
  [this]
  (-> this .-padding))

(defn set-padding!
  "Property.

  Member of Filter.

  The padding of the filter. Some filters require extra space to
  such as a blur.
  Increasing this will add extra width and height to the bounds
  the object that the
  filter is applied to."
  [this val]
  (aset this "padding" val))

(defn program
  "Property.

  Member of Filter.

  Program that the shader uses"
  [this]
  (-> this .-program))

(defn set-program!
  "Property.

  Member of Filter.

  Program that the shader uses"
  [this val]
  (aset this "program" val))

(defn resolution
  "Property.

  Member of Filter.

  The resolution of the filter. Setting this to be lower will lower
  quality but
  increase the performance of the filter."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of Filter.

  The resolution of the filter. Setting this to be lower will lower
  quality but
  increase the performance of the filter."
  [this val]
  (aset this "resolution" val))

(defn state
  "Property.

  Member of Filter.

  The WebGL state the filter requires to render"
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of Filter.

  The WebGL state the filter requires to render"
  [this val]
  (aset this "state" val))

(defn uniforms
  "Property.

  Member of Filter.

  Shader uniform values, shortcut for `uniformGroup.uniforms`"
  [this]
  (-> this .-uniforms))

(defn set-uniforms!
  "Property.

  Member of Filter.

  Shader uniform values, shortcut for `uniformGroup.uniforms`"
  [this val]
  (aset this "uniforms" val))

