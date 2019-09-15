(ns pixi.core.Geometry
  "The Geometry represents a model. It consists of two components:
  - GeometryStyle - The structure of the model such as the attributes
  - GeometryData - the data of the model - this consists of buffers.
  This can include anything from positions, uvs, normals, colors
  Geometry can be defined without passing in a style or data if
  (thats how I prefer!)
  ```js
  let geometry = new PIXI.Geometry();
  geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0,
  2);
  geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1],2)
  geometry.addIndex([0,1,2,1,3,2])
  ```"
  (:refer-clojure :exclude [clone interleave merge]))

(defn new
  "Constructor."
  ([]
    (new js/Geometry))
  ([buffers]
    (new js/Geometry buffers))
  ([buffers attributes]
    (new js/Geometry buffers attributes)))

(defn add-attribute
  "Method.

  Member of Geometry.

  Adds an attribute to the geometry"
  ([this id]
    (-> this (.addAttribute id)))
  ([this id buffer]
    (-> this (.addAttribute id buffer)))
  ([this id buffer size]
    (-> this (.addAttribute id buffer size)))
  ([this id buffer size normalized]
    (-> this (.addAttribute id buffer size normalized)))
  ([this id buffer size normalized type]
    (-> this (.addAttribute id buffer size normalized type)))
  ([this id buffer size normalized type stride]
    (-> this (.addAttribute id buffer size normalized type stride)))
  ([this id buffer size normalized type stride start]
    (-> this (.addAttribute id buffer size normalized type stride start))))

(defn add-index
  "Method.

  Member of Geometry.

  Adds an index buffer to the geometry
  The index buffer contains integers, three for each triangle in
  geometry, which reference the various attribute buffers (position,
  UV coordinates, other UV coordinates, normal, …). There is only
  index buffer."
  ([this]
    (-> this (.addIndex)))
  ([this buffer]
    (-> this (.addIndex buffer))))

(defn clone
  "Method.

  Member of Geometry.

  returns a clone of the geometry"
  ([this]
    (-> this (.clone))))

(defn destroy
  "Method.

  Member of Geometry.

  Destroys the geometry."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of Geometry.

  disposes WebGL resources that are connected to this geometry"
  ([this]
    (-> this (.dispose))))

(defn get-attribute
  "Method.

  Member of Geometry.

  returns the requested attribute"
  ([this id]
    (-> this (.getAttribute id))))

(defn get-buffer
  "Method.

  Member of Geometry.

  returns the requested buffer"
  ([this id]
    (-> this (.getBuffer id))))

(defn get-index
  "Method.

  Member of Geometry.

  returns the index buffer"
  ([this]
    (-> this (.getIndex))))

(defn interleave
  "Method.

  Member of Geometry.

  this function modifies the structure so that all current attributes
  interleaved into a single buffer
  This can be useful if your model remains static as it offers
  little performance boost"
  ([this]
    (-> this (.interleave))))

(defn *merge
  "Method.

  Member of Geometry.

  merges an array of geometries into a new single one
  geometry attribute styles must match for this operation to work"
  ([geometries]
    (-> js/Geometry (.merge geometries))))

(defn gl-vertex-array-objects
  "Property.

  Member of Geometry.

  A map of renderer IDs to webgl VAOs"
  [this]
  (-> this .-glVertexArrayObjects))

(defn set-gl-vertex-array-objects!
  "Property.

  Member of Geometry.

  A map of renderer IDs to webgl VAOs"
  [this val]
  (aset this "glVertexArrayObjects" val))

(defn instance-count
  "Property.

  Member of Geometry.

  Number of instances in this geometry, pass it to `GeometrySystem.draw()`"
  [this]
  (-> this .-instanceCount))

(defn set-instance-count!
  "Property.

  Member of Geometry.

  Number of instances in this geometry, pass it to `GeometrySystem.draw()`"
  [this val]
  (aset this "instanceCount" val))

(defn ref-count
  "Property.

  Member of Geometry.

  Count of existing (not destroyed) meshes that reference this"
  [this]
  (-> this .-refCount))

(defn set-ref-count!
  "Property.

  Member of Geometry.

  Count of existing (not destroyed) meshes that reference this"
  [this val]
  (aset this "refCount" val))

