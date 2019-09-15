(ns pixi.core.FilterState
  "System plugin to the renderer to manage filter states."
  (:refer-clojure :exclude [pop]))

(defn new
  "Constructor."
  ([]
    (new js/FilterState)))

(defn apply-filter
  "Method.

  Member of FilterState.

  Draws a filter."
  ([this filter input output clear]
    (-> this (.applyFilter filter input output clear))))

(defn calculate-sprite-matrix
  "Method.

  Member of FilterState.

  Multiply _input normalized coordinates_ to this matrix to get
  texture normalized coordinates_.
  Use `outputMatrix * vTextureCoord` in the shader."
  ([this output-matrix sprite]
    (-> this (.calculateSpriteMatrix output-matrix sprite))))

(defn clear
  "Method.

  Member of FilterState.

  clears the state"
  ([this]
    (-> this (.clear))))

(defn destroy
  "Method.

  Member of FilterState.

  Destroys this Filter System."
  ([this]
    (-> this (.destroy))))

(defn empty-pool
  "Method.

  Member of FilterState.

  Empties the texture pool."
  ([this]
    (-> this (.emptyPool))))

(defn get-filter-texture
  "Method.

  Member of FilterState.

  Gets extra render texture to use inside current filter
  To be compliant with older filters, you can use params in any"
  ([this]
    (-> this (.getFilterTexture)))
  ([this input]
    (-> this (.getFilterTexture input)))
  ([this input resolution]
    (-> this (.getFilterTexture input resolution))))

(defn get-optimal-filter-texture
  "Method.

  Member of FilterState.

  Gets a Power-of-Two render texture or fullScreen texture"
  ([this min-width min-height]
    (-> this (.getOptimalFilterTexture min-width min-height)))
  ([this min-width min-height resolution]
    (-> this (.getOptimalFilterTexture min-width min-height resolution))))

(defn pop
  "Method.

  Member of FilterState.

  Pops off the filter and applies it."
  ([this]
    (-> this (.pop))))

(defn push
  "Method.

  Member of FilterState.

  Adds a new filter to the System."
  ([this target filters]
    (-> this (.push target filters))))

(defn resize
  "Method.

  Member of FilterState.

  calls `texturePool.resize()`, affects fullScreen renderTextures"
  ([this]
    (-> this (.resize))))

(defn return-filter-texture
  "Method.

  Member of FilterState.

  Frees a render texture back into the pool."
  ([this render-texture]
    (-> this (.returnFilterTexture render-texture))))

(defn active-state
  "Property.

  Member of FilterState.

  Active state"
  [this]
  (-> this .-activeState))

(defn set-active-state!
  "Property.

  Member of FilterState.

  Active state"
  [this val]
  (aset this "activeState" val))

(defn default-filter-stack
  "Property.

  Member of FilterState.

  List of filters for the FilterSystem"
  [this]
  (-> this .-defaultFilterStack))

(defn set-default-filter-stack!
  "Property.

  Member of FilterState.

  List of filters for the FilterSystem"
  [this val]
  (aset this "defaultFilterStack" val))

(defn destination-frame
  "Property.

  Member of FilterState.

  Destination frame"
  [this]
  (-> this .-destinationFrame))

(defn set-destination-frame!
  "Property.

  Member of FilterState.

  Destination frame"
  [this val]
  (aset this "destinationFrame" val))

(defn filters
  "Property.

  Member of FilterState.

  Collection of filters"
  [this]
  (-> this .-filters))

(defn set-filters!
  "Property.

  Member of FilterState.

  Collection of filters"
  [this val]
  (aset this "filters" val))

(defn global-uniforms
  "Property.

  Member of FilterState.

  This uniform group is attached to filter uniforms when used"
  [this]
  (-> this .-globalUniforms))

(defn set-global-uniforms!
  "Property.

  Member of FilterState.

  This uniform group is attached to filter uniforms when used"
  [this val]
  (aset this "globalUniforms" val))

(defn legacy
  "Property.

  Member of FilterState.

  Compatibility with PixiJS v4 filters"
  [this]
  (-> this .-legacy))

(defn set-legacy!
  "Property.

  Member of FilterState.

  Compatibility with PixiJS v4 filters"
  [this val]
  (aset this "legacy" val))

(defn quad
  "Property.

  Member of FilterState.

  A very simple geometry used when drawing a filter effect to the"
  [this]
  (-> this .-quad))

(defn set-quad!
  "Property.

  Member of FilterState.

  A very simple geometry used when drawing a filter effect to the"
  [this val]
  (aset this "quad" val))

(defn quad-uv
  "Property.

  Member of FilterState.

  Quad UVs"
  [this]
  (-> this .-quadUv))

(defn set-quad-uv!
  "Property.

  Member of FilterState.

  Quad UVs"
  [this val]
  (aset this "quadUv" val))

(defn resolution
  "Property.

  Member of FilterState.

  Resolution of filters"
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of FilterState.

  Resolution of filters"
  [this val]
  (aset this "resolution" val))

(defn source-frame
  "Property.

  Member of FilterState.

  Source frame"
  [this]
  (-> this .-sourceFrame))

(defn set-source-frame!
  "Property.

  Member of FilterState.

  Source frame"
  [this val]
  (aset this "sourceFrame" val))

(defn state-pool
  "Property.

  Member of FilterState.

  a pool for storing filter states, save us creating new ones each"
  [this]
  (-> this .-statePool))

(defn set-state-pool!
  "Property.

  Member of FilterState.

  a pool for storing filter states, save us creating new ones each"
  [this val]
  (aset this "statePool" val))

(defn target
  "Property.

  Member of FilterState.

  Target of the filters
  We store for case when custom filter wants to know the element
  was applied on"
  [this]
  (-> this .-target))

(defn set-target!
  "Property.

  Member of FilterState.

  Target of the filters
  We store for case when custom filter wants to know the element
  was applied on"
  [this val]
  (aset this "target" val))

(defn temp-rect
  "Property.

  Member of FilterState.

  Temporary rect for maths"
  [this]
  (-> this .-tempRect))

(defn set-temp-rect!
  "Property.

  Member of FilterState.

  Temporary rect for maths"
  [this val]
  (aset this "tempRect" val))

(defn texture-pool
  "Property.

  Member of FilterState.

  stores a bunch of PO2 textures used for filtering"
  [this]
  (-> this .-texturePool))

(defn set-texture-pool!
  "Property.

  Member of FilterState.

  stores a bunch of PO2 textures used for filtering"
  [this val]
  (aset this "texturePool" val))

