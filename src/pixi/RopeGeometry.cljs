(ns pixi.RopeGeometry
  "Extends - MeshGeometry.

  RopeGeometry allows you to draw a geometry across several points
  then manipulate these points.
  ```js
  for (let i = 0; i < 20; i++) {
  points.push(new PIXI.Point(i * 50, 0));
  };
  const rope = new PIXI.RopeGeometry(100, points);
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/RopeGeometry))
  ([width]
    (new js/RopeGeometry width))
  ([width points]
    (new js/RopeGeometry width points)))

(defn build
  "Method.

  Member of RopeGeometry.

  Refreshes Rope indices and uvs"
  ([this]
    (-> this (.build))))

(defn update-vertices
  "Method.

  Member of RopeGeometry.

  refreshes vertices of Rope mesh"
  ([this]
    (-> this (.updateVertices))))

(defn points
  "Property.

  Member of RopeGeometry.

  An array of points that determine the rope"
  [this]
  (-> this .-points))

(defn set-points!
  "Property.

  Member of RopeGeometry.

  An array of points that determine the rope"
  [this val]
  (aset this "points" val))

(defn vertex-dirty-id
  "Property.

  Member of RopeGeometry.

  If the vertex position is updated."
  [this]
  (-> this .-vertexDirtyId))

(defn set-vertex-dirty-id!
  "Property.

  Member of RopeGeometry.

  If the vertex position is updated."
  [this val]
  (aset this "vertexDirtyId" val))

(defn width
  "Property.

  Member of RopeGeometry.

  The width (i.e., thickness) of the rope."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of RopeGeometry.

  The width (i.e., thickness) of the rope."
  [this val]
  (aset this "width" val))

