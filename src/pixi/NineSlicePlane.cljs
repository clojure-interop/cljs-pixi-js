(ns pixi.NineSlicePlane
  "Extends - SimplePlane.

  The NineSlicePlane allows you to stretch a texture using 9-slice
  The corners will remain unscaled (useful
  for buttons with rounded corners for example) and the other areas
  be scaled horizontally and or vertically
  ```js
  let Plane9 = new PIXI.NineSlicePlane(PIXI.Texture.from('BoxWithRoundedCorners.png'),
  15, 15, 15);
  ```
  <pre>
  A B
  +---+----------------------+---+
  C | 1 | 2 | 3 |
  +---+----------------------+---+
  | | | |
  | 4 | 5 | 6 |
  | | | |
  +---+----------------------+---+
  D | 7 | 8 | 9 |
  +---+----------------------+---+
  When changing this objects width and/or height:
  areas 1 3 7 and 9 will remain unscaled.
  areas 2 and 8 will be stretched horizontally
  areas 4 and 6 will be stretched vertically
  area 5 will be stretched both horizontally and vertically
  </pre>"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([texture]
    (new js/NineSlicePlane texture))
  ([texture left-width]
    (new js/NineSlicePlane texture left-width))
  ([texture left-width top-height]
    (new js/NineSlicePlane texture left-width top-height))
  ([texture left-width top-height right-width]
    (new js/NineSlicePlane texture left-width top-height right-width))
  ([texture left-width top-height right-width bottom-height]
    (new js/NineSlicePlane texture left-width top-height right-width bottom-height)))

(defn texture-updated
  "Method.

  Member of NineSlicePlane.

  Method used for overrides, to do something in case texture frame
  changed.
  Meshes based on plane can override it and change more details
  on texture."
  ([this]
    (-> this (.textureUpdated))))

(defn update-horizontal-vertices
  "Method.

  Member of NineSlicePlane.

  Updates the horizontal vertices."
  ([this]
    (-> this (.updateHorizontalVertices))))

(defn update-vertical-vertices
  "Method.

  Member of NineSlicePlane.

  Updates the vertical vertices."
  ([this]
    (-> this (.updateVerticalVertices))))

(defn bottom-height
  "Property.

  Member of NineSlicePlane.

  The height of the bottom row"
  [this]
  (-> this .-bottomHeight))

(defn set-bottom-height!
  "Property.

  Member of NineSlicePlane.

  The height of the bottom row"
  [this val]
  (aset this "bottomHeight" val))

(defn height
  "Property.

  Member of NineSlicePlane.

  The height of the NineSlicePlane, setting this will actually
  the vertices and UV's of this plane"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of NineSlicePlane.

  The height of the NineSlicePlane, setting this will actually
  the vertices and UV's of this plane"
  [this val]
  (aset this "height" val))

(defn left-width
  "Property.

  Member of NineSlicePlane.

  The width of the left column"
  [this]
  (-> this .-leftWidth))

(defn set-left-width!
  "Property.

  Member of NineSlicePlane.

  The width of the left column"
  [this val]
  (aset this "leftWidth" val))

(defn right-width
  "Property.

  Member of NineSlicePlane.

  The width of the right column"
  [this]
  (-> this .-rightWidth))

(defn set-right-width!
  "Property.

  Member of NineSlicePlane.

  The width of the right column"
  [this val]
  (aset this "rightWidth" val))

(defn top-height
  "Property.

  Member of NineSlicePlane.

  The height of the top row"
  [this]
  (-> this .-topHeight))

(defn set-top-height!
  "Property.

  Member of NineSlicePlane.

  The height of the top row"
  [this val]
  (aset this "topHeight" val))

(defn width
  "Property.

  Member of NineSlicePlane.

  The width of the NineSlicePlane, setting this will actually modify
  vertices and UV's of this plane"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of NineSlicePlane.

  The width of the NineSlicePlane, setting this will actually modify
  vertices and UV's of this plane"
  [this val]
  (aset this "width" val))

