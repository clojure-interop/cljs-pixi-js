(ns pixi.core.QuadUv
  "Extends - Geometry.

  Helper class to create a quad with uvs like in v4"
  (:refer-clojure :exclude [map clone interleave merge]))

(defn new
  "Constructor."
  ([]
    (new js/QuadUv)))

(defn add-attribute
  "Method.

  Member of QuadUv.

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

  Member of QuadUv.

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

  Member of QuadUv.

  returns a clone of the geometry"
  ([this]
    (-> this (.clone))))

(defn destroy
  "Method.

  Member of QuadUv.

  Destroys the geometry."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of QuadUv.

  disposes WebGL resources that are connected to this geometry"
  ([this]
    (-> this (.dispose))))

(defn get-attribute
  "Method.

  Member of QuadUv.

  returns the requested attribute"
  ([this id]
    (-> this (.getAttribute id))))

(defn get-buffer
  "Method.

  Member of QuadUv.

  returns the requested buffer"
  ([this id]
    (-> this (.getBuffer id))))

(defn get-index
  "Method.

  Member of QuadUv.

  returns the index buffer"
  ([this]
    (-> this (.getIndex))))

(defn interleave
  "Method.

  Member of QuadUv.

  this function modifies the structure so that all current attributes
  interleaved into a single buffer
  This can be useful if your model remains static as it offers
  little performance boost"
  ([this]
    (-> this (.interleave))))

(defn invalidate
  "Method.

  Member of QuadUv.

  legacy upload method, just marks buffers dirty"
  ([this]
    (-> this (.invalidate))))

(defn map
  "Method.

  Member of QuadUv.

  Maps two Rectangle to the quad."
  ([this target-texture-frame destination-frame]
    (-> this (.map target-texture-frame destination-frame))))

(defn *merge
  "Method.

  Member of QuadUv.

  merges an array of geometries into a new single one
  geometry attribute styles must match for this operation to work"
  ([geometries]
    (-> js/Geometry (.merge geometries))))

(defn gl-vertex-array-objects
  "Property.

  Member of QuadUv.

  A map of renderer IDs to webgl VAOs"
  [this]
  (-> this .-glVertexArrayObjects))

(defn set-gl-vertex-array-objects!
  "Property.

  Member of QuadUv.

  A map of renderer IDs to webgl VAOs"
  [this val]
  (aset this "glVertexArrayObjects" val))

(defn instance-count
  "Property.

  Member of QuadUv.

  Number of instances in this geometry, pass it to `GeometrySystem.draw()`"
  [this]
  (-> this .-instanceCount))

(defn set-instance-count!
  "Property.

  Member of QuadUv.

  Number of instances in this geometry, pass it to `GeometrySystem.draw()`"
  [this val]
  (aset this "instanceCount" val))

(defn ref-count
  "Property.

  Member of QuadUv.

  Count of existing (not destroyed) meshes that reference this"
  [this]
  (-> this .-refCount))

(defn set-ref-count!
  "Property.

  Member of QuadUv.

  Count of existing (not destroyed) meshes that reference this"
  [this val]
  (aset this "refCount" val))

(defn uvs
  "Property.

  Member of QuadUv.

  The Uvs of the quad"
  [this]
  (-> this .-uvs))

(defn set-uvs!
  "Property.

  Member of QuadUv.

  The Uvs of the quad"
  [this val]
  (aset this "uvs" val))

(defn vertices
  "Property.

  Member of QuadUv.

  An array of vertices"
  [this]
  (-> this .-vertices))

(defn set-vertices!
  "Property.

  Member of QuadUv.

  An array of vertices"
  [this val]
  (aset this "vertices" val))

