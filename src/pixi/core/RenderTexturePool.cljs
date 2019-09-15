(ns pixi.core.RenderTexturePool
  "Experimental!
  Texture pool, used by FilterSystem and plugins
  Stores collection of temporary pow2 or screen-sized renderTextures
  If you use custom RenderTexturePool for your filters, you can
  methods
  `getFilterTexture` and `returnFilterTexture` same as in"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/RenderTexturePool))
  ([texture-options]
    (new js/RenderTexturePool texture-options)))

(defn clear
  "Method.

  Member of RenderTexturePool.

  Clears the pool"
  ([this]
    (-> this (.clear)))
  ([this destroy-textures]
    (-> this (.clear destroy-textures))))

(defn create-texture
  "Method.

  Member of RenderTexturePool.

  creates of texture with params that were specified in pool constructor"
  ([this real-width real-height]
    (-> this (.createTexture real-width real-height))))

(defn get-filter-texture
  "Method.

  Member of RenderTexturePool.

  Gets extra texture of the same size as input renderTexture
  `getFilterTexture(input, 0.5)` or `getFilterTexture(0.5, input)`"
  ([this input]
    (-> this (.getFilterTexture input)))
  ([this input resolution]
    (-> this (.getFilterTexture input resolution))))

(defn get-optimal-texture
  "Method.

  Member of RenderTexturePool.

  Gets a Power-of-Two render texture or fullScreen texture"
  ([this min-width min-height]
    (-> this (.getOptimalTexture min-width min-height)))
  ([this min-width min-height resolution]
    (-> this (.getOptimalTexture min-width min-height resolution))))

(defn return-filter-texture
  "Method.

  Member of RenderTexturePool.

  Alias for returnTexture, to be compliant with FilterSystem interface"
  ([this render-texture]
    (-> this (.returnFilterTexture render-texture))))

(defn return-texture
  "Method.

  Member of RenderTexturePool.

  Place a render texture back into the pool."
  ([this render-texture]
    (-> this (.returnTexture render-texture))))

(defn set-screen-size
  "Method.

  Member of RenderTexturePool.

  If screen size was changed, drops all screen-sized textures,
  sets new screen size, sets `enableFullScreen` to true
  Size is measured in pixels, `renderer.view` can be passed here,
  `renderer.screen`"
  ([this size]
    (-> this (.setScreenSize size))))

(defn enable-full-screen
  "Property.

  Member of RenderTexturePool.

  Allow renderTextures of the same size as screen, not just pow2
  Automatically sets to true after `setScreenSize`"
  [this]
  (-> this .-enableFullScreen))

(defn set-enable-full-screen!
  "Property.

  Member of RenderTexturePool.

  Allow renderTextures of the same size as screen, not just pow2
  Automatically sets to true after `setScreenSize`"
  [this val]
  (aset this "enableFullScreen" val))

