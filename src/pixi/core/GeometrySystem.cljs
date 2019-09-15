(ns pixi.core.GeometrySystem
  "Extends - System.

  System plugin to the renderer to manage geometry."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/GeometrySystem renderer)))

(defn activate-vao
  "Method.

  Member of GeometrySystem.

  Activate vertex array object"
  ([this geometry program]
    (-> this (.activateVao geometry program))))

(defn bind
  "Method.

  Member of GeometrySystem.

  Binds geometry so that is can be drawn. Creating a Vao if required"
  ([this geometry]
    (-> this (.bind geometry)))
  ([this geometry shader]
    (-> this (.bind geometry shader))))

(defn check-compatibility
  "Method.

  Member of GeometrySystem.

  Check compability between a geometry and a program"
  ([this geometry program]
    (-> this (.checkCompatibility geometry program))))

(defn context-change
  "Method.

  Member of GeometrySystem.

  Sets up the renderer context and necessary buffers."
  ([this]
    (-> this (.contextChange))))

(defn destroy
  "Method.

  Member of GeometrySystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn dispose-all
  "Method.

  Member of GeometrySystem.

  dispose all WebGL resources of all managed geometries and buffers"
  ([this]
    (-> this (.disposeAll)))
  ([this context-lost]
    (-> this (.disposeAll context-lost))))

(defn dispose-buffer
  "Method.

  Member of GeometrySystem.

  Disposes buffer"
  ([this buffer]
    (-> this (.disposeBuffer buffer)))
  ([this buffer context-lost]
    (-> this (.disposeBuffer buffer context-lost))))

(defn dispose-geometry
  "Method.

  Member of GeometrySystem.

  Disposes geometry"
  ([this geometry]
    (-> this (.disposeGeometry geometry)))
  ([this geometry context-lost]
    (-> this (.disposeGeometry geometry context-lost))))

(defn draw
  "Method.

  Member of GeometrySystem.

  Draw the geometry"
  ([this type]
    (-> this (.draw type)))
  ([this type size]
    (-> this (.draw type size)))
  ([this type size start]
    (-> this (.draw type size start)))
  ([this type size start instance-count]
    (-> this (.draw type size start instance-count))))

(defn get-signature
  "Method.

  Member of GeometrySystem.

  Takes a geometry and program and generates a unique signature
  them."
  ([this geometry program]
    (-> this (.getSignature geometry program))))

(defn init-geometry-vao
  "Method.

  Member of GeometrySystem.

  Creates or gets Vao with the same structure as the geometry and
  it on the geometry.
  If vao is created, it is bound automatically."
  ([this geometry program]
    (-> this (.initGeometryVao geometry program))))

(defn reset
  "Method.

  Member of GeometrySystem.

  Reset and unbind any active VAO and geometry"
  ([this]
    (-> this (.reset))))

(defn unbind
  "Method.

  Member of GeometrySystem.

  Unbind/reset everything"
  ([this]
    (-> this (.unbind))))

(defn update-buffers
  "Method.

  Member of GeometrySystem.

  Update buffers"
  ([this]
    (-> this (.updateBuffers))))

(defn bound-buffers
  "Property.

  Member of GeometrySystem.

  A cache of currently bound buffer,
  contains only two members with keys ARRAY_BUFFER and ELEMENT_ARRAY_BUFFER"
  [this]
  (-> this .-boundBuffers))

(defn set-bound-buffers!
  "Property.

  Member of GeometrySystem.

  A cache of currently bound buffer,
  contains only two members with keys ARRAY_BUFFER and ELEMENT_ARRAY_BUFFER"
  [this val]
  (aset this "boundBuffers" val))

(defn can-use-u-int32element-index
  "Property.

  Member of GeometrySystem.

  `true` if support `gl.UNSIGNED_INT` in `gl.drawElements` or `gl.drawElementsInstanced`"
  [this]
  (-> this .-canUseUInt32ElementIndex))

(defn set-can-use-u-int32element-index!
  "Property.

  Member of GeometrySystem.

  `true` if support `gl.UNSIGNED_INT` in `gl.drawElements` or `gl.drawElementsInstanced`"
  [this val]
  (aset this "canUseUInt32ElementIndex" val))

(defn has-instance
  "Property.

  Member of GeometrySystem.

  `true` if has `ANGLE_instanced_arrays` extension"
  [this]
  (-> this .-hasInstance))

(defn set-has-instance!
  "Property.

  Member of GeometrySystem.

  `true` if has `ANGLE_instanced_arrays` extension"
  [this val]
  (aset this "hasInstance" val))

(defn has-vao
  "Property.

  Member of GeometrySystem.

  `true` if we has `*_vertex_array_object` extension"
  [this]
  (-> this .-hasVao))

(defn set-has-vao!
  "Property.

  Member of GeometrySystem.

  `true` if we has `*_vertex_array_object` extension"
  [this val]
  (aset this "hasVao" val))

(defn managed-buffers
  "Property.

  Member of GeometrySystem.

  Cache for all buffers by id, used in case renderer gets destroyed
  for profiling"
  [this]
  (-> this .-managedBuffers))

(defn set-managed-buffers!
  "Property.

  Member of GeometrySystem.

  Cache for all buffers by id, used in case renderer gets destroyed
  for profiling"
  [this val]
  (aset this "managedBuffers" val))

(defn managed-geometries
  "Property.

  Member of GeometrySystem.

  Cache for all geometries by id, used in case renderer gets destroyed
  for profiling"
  [this]
  (-> this .-managedGeometries))

(defn set-managed-geometries!
  "Property.

  Member of GeometrySystem.

  Cache for all geometries by id, used in case renderer gets destroyed
  for profiling"
  [this val]
  (aset this "managedGeometries" val))

(defn renderer
  "Property.

  Member of GeometrySystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of GeometrySystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

