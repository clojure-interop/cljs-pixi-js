(ns pixi.MeshGeometry
  "Extends - Geometry.

  Standard 2D geometry used in PixiJS.
  Geometry can be defined without passing in a style or data if
  ```js
  const geometry = new PIXI.Geometry();
  geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0,
  2);
  geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1], 2);
  geometry.addIndex([0,1,2,1,3,2]);
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([vertices uvs index]
    (new js/MeshGeometry vertices uvs index)))

(defn vertex-dirty-id
  "Property.

  Member of MeshGeometry.

  If the vertex position is updated."
  [this]
  (-> this .-vertexDirtyId))

(defn set-vertex-dirty-id!
  "Property.

  Member of MeshGeometry.

  If the vertex position is updated."
  [this val]
  (aset this "vertexDirtyId" val))

