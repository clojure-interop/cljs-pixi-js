(ns pixi.core.TextureUvs
  "Stores a texture's frame in UV coordinates, in
  which everything lies in the rectangle `[(0,0), (1,0),
  (1,1), (0,1)]`.
  | Corner | Coordinates |
  |--------------|-------------|
  | Top-Left | `(x0,y0)` |
  | Top-Right | `(x1,y1)` |
  | Bottom-Right | `(x2,y2)` |
  | Bottom-Left | `(x3,y3)` |"
  (:refer-clojure :exclude [set]))

(defn new
  "Constructor."
  ([]
    (new js/TextureUvs)))

(defn set
  "Method.

  Member of TextureUvs.

  Sets the texture Uvs based on the given frame information."
  ([this frame base-frame rotate]
    (-> this (.set frame base-frame rotate))))

(defn x0
  "Property.

  Member of TextureUvs.

  X-component of top-left corner `(x0,y0)`."
  [this]
  (-> this .-x0))

(defn set-x0!
  "Property.

  Member of TextureUvs.

  X-component of top-left corner `(x0,y0)`."
  [this val]
  (aset this "x0" val))

(defn x1
  "Property.

  Member of TextureUvs.

  X-component of top-right corner `(x1,y1)`."
  [this]
  (-> this .-x1))

(defn set-x1!
  "Property.

  Member of TextureUvs.

  X-component of top-right corner `(x1,y1)`."
  [this val]
  (aset this "x1" val))

(defn x2
  "Property.

  Member of TextureUvs.

  X-component of bottom-right corner `(x2,y2)`."
  [this]
  (-> this .-x2))

(defn set-x2!
  "Property.

  Member of TextureUvs.

  X-component of bottom-right corner `(x2,y2)`."
  [this val]
  (aset this "x2" val))

(defn x3
  "Property.

  Member of TextureUvs.

  X-component of bottom-left corner `(x3,y3)`."
  [this]
  (-> this .-x3))

(defn set-x3!
  "Property.

  Member of TextureUvs.

  X-component of bottom-left corner `(x3,y3)`."
  [this val]
  (aset this "x3" val))

(defn y0
  "Property.

  Member of TextureUvs.

  Y-component of top-left corner `(x0,y0)`."
  [this]
  (-> this .-y0))

(defn set-y0!
  "Property.

  Member of TextureUvs.

  Y-component of top-left corner `(x0,y0)`."
  [this val]
  (aset this "y0" val))

(defn y1
  "Property.

  Member of TextureUvs.

  Y-component of top-right corner `(x1,y1)`."
  [this]
  (-> this .-y1))

(defn set-y1!
  "Property.

  Member of TextureUvs.

  Y-component of top-right corner `(x1,y1)`."
  [this val]
  (aset this "y1" val))

(defn y2
  "Property.

  Member of TextureUvs.

  Y-component of bottom-right corner `(x2,y2)`."
  [this]
  (-> this .-y2))

(defn set-y2!
  "Property.

  Member of TextureUvs.

  Y-component of bottom-right corner `(x2,y2)`."
  [this val]
  (aset this "y2" val))

(defn y3
  "Property.

  Member of TextureUvs.

  Y-component of bottom-right corner `(x3,y3)`."
  [this]
  (-> this .-y3))

(defn set-y3!
  "Property.

  Member of TextureUvs.

  Y-component of bottom-right corner `(x3,y3)`."
  [this val]
  (aset this "y3" val))

