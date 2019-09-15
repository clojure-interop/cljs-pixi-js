(ns pixi.core.Renderer
  "Extends - AbstractRenderer.

  The Renderer draws the scene and all its content onto a WebGL
  canvas.
  This renderer should be used for browsers that support WebGL.
  This renderer works by automatically managing WebGLBatchesm,
  no need for Sprite Batches or Sprite Clouds.
  Don't forget to add the view to your DOM or you will not see"
  (:refer-clojure :exclude [filter type create]))

(defn new
  "Constructor."
  ([]
    (new js/Renderer))
  ([options]
    (new js/Renderer options)))

(defn add-system
  "Method.

  Member of Renderer.

  Add a new system to the renderer."
  ([this class-ref]
    (-> this (.addSystem class-ref)))
  ([this class-ref name]
    (-> this (.addSystem class-ref name))))

(defn clear
  "Method.

  Member of Renderer.

  Clear the frame buffer"
  ([this]
    (-> this (.clear))))

(defn *create
  "Method.

  Member of Renderer.

  Create renderer if WebGL is available. Overrideable
  by the **@pixi/canvas-renderer** package to allow fallback.
  throws error if WebGL is not available."
  ([]
    (-> js/Renderer (.create))))

(defn destroy
  "Method.

  Member of Renderer.

  Removes everything from the renderer (event listeners, spritebatch,"
  ([this]
    (-> this (.destroy)))
  ([this remove-view]
    (-> this (.destroy remove-view))))

(defn generate-texture
  "Method.

  Member of Renderer.

  Useful function that returns a texture of the display object
  can then be used to create sprites
  This can be quite useful if your displayObject is complicated
  needs to be reused multiple times."
  ([this display-object scale-mode resolution]
    (-> this (.generateTexture display-object scale-mode resolution)))
  ([this display-object scale-mode resolution region]
    (-> this (.generateTexture display-object scale-mode resolution region))))

(defn init-plugins
  "Method.

  Member of Renderer.

  Initialize the plugins."
  ([this static-map]
    (-> this (.initPlugins static-map))))

(defn *register-plugin
  "Method.

  Member of Renderer.

  Adds a plugin to the renderer."
  ([plugin-name ctor]
    (-> js/Renderer (.registerPlugin plugin-name ctor))))

(defn render
  "Method.

  Member of Renderer.

  Renders the object to its WebGL view"
  ([this display-object]
    (-> this (.render display-object)))
  ([this display-object render-texture]
    (-> this (.render display-object render-texture)))
  ([this display-object render-texture clear]
    (-> this (.render display-object render-texture clear)))
  ([this display-object render-texture clear transform]
    (-> this (.render display-object render-texture clear transform)))
  ([this display-object render-texture clear transform skip-update-transform]
    (-> this (.render display-object render-texture clear transform skip-update-transform))))

(defn reset
  "Method.

  Member of Renderer.

  Resets the WebGL state so you can render things however you fancy!"
  ([this]
    (-> this (.reset))))

(defn resize
  "Method.

  Member of Renderer.

  Resizes the WebGL view to the specified width and height."
  ([this screen-width screen-height]
    (-> this (.resize screen-width screen-height))))

(defn auto-density
  "Property.

  Member of Renderer.

  Whether CSS dimensions of canvas view should be resized to screen
  automatically."
  [this]
  (-> this .-autoDensity))

(defn set-auto-density!
  "Property.

  Member of Renderer.

  Whether CSS dimensions of canvas view should be resized to screen
  automatically."
  [this val]
  (aset this "autoDensity" val))

(defn background-color
  "Property.

  Member of Renderer.

  The background color to fill if not transparent"
  [this]
  (-> this .-backgroundColor))

(defn set-background-color!
  "Property.

  Member of Renderer.

  The background color to fill if not transparent"
  [this val]
  (aset this "backgroundColor" val))

(defn batch
  "Property.

  Member of Renderer.

  Batch system instance"
  [this]
  (-> this .-batch))

(defn set-batch!
  "Property.

  Member of Renderer.

  Batch system instance"
  [this val]
  (aset this "batch" val))

(defn clear-before-render
  "Property.

  Member of Renderer.

  This sets if the CanvasRenderer will clear the canvas or not
  the new render pass.
  If the scene is NOT transparent PixiJS will use a canvas sized
  operation every
  frame to set the canvas background color. If the scene is transparent
  will use clearRect
  to clear the canvas every frame. Disable this by setting this
  false. For example, if
  your game has a canvas filling background image you often don't
  this set."
  [this]
  (-> this .-clearBeforeRender))

(defn set-clear-before-render!
  "Property.

  Member of Renderer.

  This sets if the CanvasRenderer will clear the canvas or not
  the new render pass.
  If the scene is NOT transparent PixiJS will use a canvas sized
  operation every
  frame to set the canvas background color. If the scene is transparent
  will use clearRect
  to clear the canvas every frame. Disable this by setting this
  false. For example, if
  your game has a canvas filling background image you often don't
  this set."
  [this val]
  (aset this "clearBeforeRender" val))

(defn context
  "Property.

  Member of Renderer.

  Context system instance"
  [this]
  (-> this .-context))

(defn set-context!
  "Property.

  Member of Renderer.

  Context system instance"
  [this val]
  (aset this "context" val))

(defn filter
  "Property.

  Member of Renderer.

  Filter system instance"
  [this]
  (-> this .-filter))

(defn set-filter!
  "Property.

  Member of Renderer.

  Filter system instance"
  [this val]
  (aset this "filter" val))

(defn framebuffer
  "Property.

  Member of Renderer.

  Framebuffer system instance"
  [this]
  (-> this .-framebuffer))

(defn set-framebuffer!
  "Property.

  Member of Renderer.

  Framebuffer system instance"
  [this val]
  (aset this "framebuffer" val))

(defn geometry
  "Property.

  Member of Renderer.

  Geometry system instance"
  [this]
  (-> this .-geometry))

(defn set-geometry!
  "Property.

  Member of Renderer.

  Geometry system instance"
  [this val]
  (aset this "geometry" val))

(defn global-uniforms
  "Property.

  Member of Renderer.

  Global uniforms"
  [this]
  (-> this .-globalUniforms))

(defn set-global-uniforms!
  "Property.

  Member of Renderer.

  Global uniforms"
  [this val]
  (aset this "globalUniforms" val))

(defn height
  "Property.

  Member of Renderer.

  Same as view.height, actual number of pixels in the canvas by"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Renderer.

  Same as view.height, actual number of pixels in the canvas by"
  [this val]
  (aset this "height" val))

(defn mask
  "Property.

  Member of Renderer.

  Mask system instance"
  [this]
  (-> this .-mask))

(defn set-mask!
  "Property.

  Member of Renderer.

  Mask system instance"
  [this val]
  (aset this "mask" val))

(defn options
  "Property.

  Member of Renderer.

  The supplied constructor options."
  [this]
  (-> this .-options))

(defn set-options!
  "Property.

  Member of Renderer.

  The supplied constructor options."
  [this val]
  (aset this "options" val))

(defn plugins
  "Property.

  Member of Renderer.

  Collection of installed plugins. These are included by default
  PIXI, but can be excluded
  by creating a custom build. Consult the README for more information
  creating custom
  builds and excluding plugins."
  [this]
  (-> this .-plugins))

(defn set-plugins!
  "Property.

  Member of Renderer.

  Collection of installed plugins. These are included by default
  PIXI, but can be excluded
  by creating a custom build. Consult the README for more information
  creating custom
  builds and excluding plugins."
  [this val]
  (aset this "plugins" val))

(defn preserve-drawing-buffer
  "Property.

  Member of Renderer.

  The value of the preserveDrawingBuffer flag affects whether or
  the contents of
  the stencil buffer is retained after rendering."
  [this]
  (-> this .-preserveDrawingBuffer))

(defn set-preserve-drawing-buffer!
  "Property.

  Member of Renderer.

  The value of the preserveDrawingBuffer flag affects whether or
  the contents of
  the stencil buffer is retained after rendering."
  [this val]
  (aset this "preserveDrawingBuffer" val))

(defn projection
  "Property.

  Member of Renderer.

  Projection system instance"
  [this]
  (-> this .-projection))

(defn set-projection!
  "Property.

  Member of Renderer.

  Projection system instance"
  [this val]
  (aset this "projection" val))

(defn render-texture
  "Property.

  Member of Renderer.

  RenderTexture system instance"
  [this]
  (-> this .-renderTexture))

(defn set-render-texture!
  "Property.

  Member of Renderer.

  RenderTexture system instance"
  [this val]
  (aset this "renderTexture" val))

(defn rendering-to-screen
  "Property.

  Member of Renderer.

  Flag if we are rendering to the screen vs renderTexture"
  [this]
  (-> this .-renderingToScreen))

(defn set-rendering-to-screen!
  "Property.

  Member of Renderer.

  Flag if we are rendering to the screen vs renderTexture"
  [this val]
  (aset this "renderingToScreen" val))

(defn resolution
  "Property.

  Member of Renderer.

  The resolution / device pixel ratio of the renderer."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of Renderer.

  The resolution / device pixel ratio of the renderer."
  [this val]
  (aset this "resolution" val))

(defn runners
  "Property.

  Member of Renderer.

  Internal signal instances of **runner**, these
  are assigned to each system created."
  [this]
  (-> this .-runners))

(defn set-runners!
  "Property.

  Member of Renderer.

  Internal signal instances of **runner**, these
  are assigned to each system created."
  [this val]
  (aset this "runners" val))

(defn screen
  "Property.

  Member of Renderer.

  Measurements of the screen. (0, 0, screenWidth, screenHeight).
  Its safe to use as filterArea or hitArea for the whole stage."
  [this]
  (-> this .-screen))

(defn set-screen!
  "Property.

  Member of Renderer.

  Measurements of the screen. (0, 0, screenWidth, screenHeight).
  Its safe to use as filterArea or hitArea for the whole stage."
  [this val]
  (aset this "screen" val))

(defn shader
  "Property.

  Member of Renderer.

  Shader system instance"
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of Renderer.

  Shader system instance"
  [this val]
  (aset this "shader" val))

(defn state
  "Property.

  Member of Renderer.

  State system instance"
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of Renderer.

  State system instance"
  [this val]
  (aset this "state" val))

(defn stencil
  "Property.

  Member of Renderer.

  Stencil system instance"
  [this]
  (-> this .-stencil))

(defn set-stencil!
  "Property.

  Member of Renderer.

  Stencil system instance"
  [this val]
  (aset this "stencil" val))

(defn texture
  "Property.

  Member of Renderer.

  Texture system instance"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of Renderer.

  Texture system instance"
  [this val]
  (aset this "texture" val))

(defn texture-gc
  "Property.

  Member of Renderer.

  Texture garbage collector system instance"
  [this]
  (-> this .-textureGC))

(defn set-texture-gc!
  "Property.

  Member of Renderer.

  Texture garbage collector system instance"
  [this val]
  (aset this "textureGC" val))

(defn transparent
  "Property.

  Member of Renderer.

  Whether the render view is transparent."
  [this]
  (-> this .-transparent))

(defn set-transparent!
  "Property.

  Member of Renderer.

  Whether the render view is transparent."
  [this val]
  (aset this "transparent" val))

(defn type
  "Property.

  Member of Renderer.

  The type of this renderer as a standardized const"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of Renderer.

  The type of this renderer as a standardized const"
  [this val]
  (aset this "type" val))

(defn view
  "Property.

  Member of Renderer.

  The canvas element that everything is drawn to."
  [this]
  (-> this .-view))

(defn set-view!
  "Property.

  Member of Renderer.

  The canvas element that everything is drawn to."
  [this val]
  (aset this "view" val))

(defn width
  "Property.

  Member of Renderer.

  Same as view.width, actual number of pixels in the canvas by"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Renderer.

  Same as view.width, actual number of pixels in the canvas by"
  [this val]
  (aset this "width" val))

