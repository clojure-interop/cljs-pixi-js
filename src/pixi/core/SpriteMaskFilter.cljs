(ns pixi.core.SpriteMaskFilter
  "Extends - Filter.

  This handles a Sprite acting as a mask, as opposed to a Graphic.
  WebGL only."
  (:refer-clojure :exclude [apply]))

(defn new
  "Constructor."
  ([sprite]
    (new js/SpriteMaskFilter sprite)))

(defn apply
  "Method.

  Member of SpriteMaskFilter.

  Applies the filter"
  ([this filter-manager input output clear]
    (-> this (.apply filter-manager input output clear))))

(defn source-key-map
  "Property.

  Member of SpriteMaskFilter.

  Used for caching shader IDs"
  []
  (-> js/Filter .-SOURCE_KEY_MAP))

(defn set-source-key-map!
  "Property.

  Member of SpriteMaskFilter.

  Used for caching shader IDs"
  [val]
  (aset js/Filter "SOURCE_KEY_MAP" val))

(defn auto-fit
  "Property.

  Member of SpriteMaskFilter.

  If enabled, PixiJS will fit the filter area into boundaries for
  performance.
  Switch it off if it does not work for specific shader."
  [this]
  (-> this .-autoFit))

(defn set-auto-fit!
  "Property.

  Member of SpriteMaskFilter.

  If enabled, PixiJS will fit the filter area into boundaries for
  performance.
  Switch it off if it does not work for specific shader."
  [this val]
  (aset this "autoFit" val))

(defn blend-mode
  "Property.

  Member of SpriteMaskFilter.

  Sets the blendmode of the filter"
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of SpriteMaskFilter.

  Sets the blendmode of the filter"
  [this val]
  (aset this "blendMode" val))

(defn enabled
  "Property.

  Member of SpriteMaskFilter.

  If enabled is true the filter is applied, if false it will not."
  [this]
  (-> this .-enabled))

(defn set-enabled!
  "Property.

  Member of SpriteMaskFilter.

  If enabled is true the filter is applied, if false it will not."
  [this val]
  (aset this "enabled" val))

(defn legacy
  "Property.

  Member of SpriteMaskFilter.

  Legacy filters use position and uvs from attributes"
  [this]
  (-> this .-legacy))

(defn set-legacy!
  "Property.

  Member of SpriteMaskFilter.

  Legacy filters use position and uvs from attributes"
  [this val]
  (aset this "legacy" val))

(defn mask-matrix
  "Property.

  Member of SpriteMaskFilter.

  Mask matrix"
  [this]
  (-> this .-maskMatrix))

(defn set-mask-matrix!
  "Property.

  Member of SpriteMaskFilter.

  Mask matrix"
  [this val]
  (aset this "maskMatrix" val))

(defn mask-sprite
  "Property.

  Member of SpriteMaskFilter.

  Sprite mask"
  [this]
  (-> this .-maskSprite))

(defn set-mask-sprite!
  "Property.

  Member of SpriteMaskFilter.

  Sprite mask"
  [this val]
  (aset this "maskSprite" val))

(defn padding
  "Property.

  Member of SpriteMaskFilter.

  The padding of the filter. Some filters require extra space to
  such as a blur.
  Increasing this will add extra width and height to the bounds
  the object that the
  filter is applied to."
  [this]
  (-> this .-padding))

(defn set-padding!
  "Property.

  Member of SpriteMaskFilter.

  The padding of the filter. Some filters require extra space to
  such as a blur.
  Increasing this will add extra width and height to the bounds
  the object that the
  filter is applied to."
  [this val]
  (aset this "padding" val))

(defn resolution
  "Property.

  Member of SpriteMaskFilter.

  The resolution of the filter. Setting this to be lower will lower
  quality but
  increase the performance of the filter."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of SpriteMaskFilter.

  The resolution of the filter. Setting this to be lower will lower
  quality but
  increase the performance of the filter."
  [this val]
  (aset this "resolution" val))

(defn state
  "Property.

  Member of SpriteMaskFilter.

  The WebGL state the filter requires to render"
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of SpriteMaskFilter.

  The WebGL state the filter requires to render"
  [this val]
  (aset this "state" val))

