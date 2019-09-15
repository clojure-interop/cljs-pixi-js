(ns pixi.BatchPart
  "A little internal structure to hold interim batch objects."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/BatchPart)))

(defn add-colors
  "Method.

  Member of BatchPart.

  Add colors."
  ([this colors color alpha size]
    (-> this (.addColors colors color alpha size))))

(defn add-texture-ids
  "Method.

  Member of BatchPart.

  Add texture id that the shader/fragment wants to use."
  ([this texture-ids id size]
    (-> this (.addTextureIds texture-ids id size))))

(defn add-uvs
  "Method.

  Member of BatchPart.

  Generates the UVs for a shape."
  ([this verts uvs texture start size]
    (-> this (.addUvs verts uvs texture start size)))
  ([this verts uvs texture start size matrix]
    (-> this (.addUvs verts uvs texture start size matrix))))

(defn adjust-uvs
  "Method.

  Member of BatchPart.

  Modify uvs array according to position of texture region
  Does not work with rotated or trimmed textures"
  ([this uvs texture start size]
    (-> this (.adjustUvs uvs texture start size))))

(defn build-draw-calls
  "Method.

  Member of BatchPart.

  Converts intermediate batches data to drawCalls."
  ([this]
    (-> this (.buildDrawCalls))))

(defn calculate-bounds
  "Method.

  Member of BatchPart.

  Update the local bounds of the object. Expensive to use performance-wise."
  ([this]
    (-> this (.calculateBounds))))

(defn clear
  "Method.

  Member of BatchPart.

  Clears the graphics that were drawn to this Graphics object,
  resets fill and line style settings."
  ([this]
    (-> this (.clear))))

(defn contains-point
  "Method.

  Member of BatchPart.

  Check to see if a point is contained within this geometry."
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of BatchPart.

  Destroys the Graphics object."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn draw-hole
  "Method.

  Member of BatchPart.

  Draws the given shape to this Graphics object. Can be any of
  Rectangle, Ellipse, Line or Polygon."
  ([this shape matrix]
    (-> this (.drawHole shape matrix))))

(defn draw-shape
  "Method.

  Member of BatchPart.

  Draws the given shape to this Graphics object. Can be any of
  Rectangle, Ellipse, Line or Polygon."
  ([this shape fill-style line-style matrix]
    (-> this (.drawShape shape fill-style line-style matrix))))

(defn invalidate
  "Method.

  Member of BatchPart.

  Call if you changed graphicsData manually.
  Empties all batch buffers."
  ([this]
    (-> this (.invalidate))))

(defn is-batchable
  "Method.

  Member of BatchPart.

  Checks to see if this graphics geometry can be batched.
  Currently it needs to be small enough and not contain any native"
  ([this]
    (-> this (.isBatchable))))

(defn process-holes
  "Method.

  Member of BatchPart.

  Process the holes data."
  ([this holes]
    (-> this (.processHoles holes))))

(defn transform-points
  "Method.

  Member of BatchPart.

  Transform points using matrix."
  ([this points matrix]
    (-> this (.transformPoints points matrix))))

(defn update-batches
  "Method.

  Member of BatchPart.

  Generates intermediate batch data. Either gets converted to drawCalls
  or used to convert to batch objects directly by the Graphics"
  ([this]
    (-> this (.updateBatches))))

(defn batchable-size
  "Property.

  Member of BatchPart.

  The maximum number of points to consider an object \"batchable\",
  able to be batched by the renderer's batch system."
  []
  (-> js/BatchPart .-BATCHABLE_SIZE))

(defn set-batchable-size!
  "Property.

  Member of BatchPart.

  The maximum number of points to consider an object \"batchable\",
  able to be batched by the renderer's batch system."
  [val]
  (aset js/BatchPart "BATCHABLE_SIZE" val))

(defn batch-dirty
  "Property.

  Member of BatchPart.

  Batches need to regenerated if the geometry is updated."
  [this]
  (-> this .-batchDirty))

(defn set-batch-dirty!
  "Property.

  Member of BatchPart.

  Batches need to regenerated if the geometry is updated."
  [this val]
  (aset this "batchDirty" val))

(defn batches
  "Property.

  Member of BatchPart.

  Intermediate abstract format sent to batch system.
  Can be converted to drawCalls or to batchable objects."
  [this]
  (-> this .-batches))

(defn set-batches!
  "Property.

  Member of BatchPart.

  Intermediate abstract format sent to batch system.
  Can be converted to drawCalls or to batchable objects."
  [this val]
  (aset this "batches" val))

(defn bounds
  "Property.

  Member of BatchPart.

  Get the current bounds of the graphic geometry."
  [this]
  (-> this .-bounds))

(defn set-bounds!
  "Property.

  Member of BatchPart.

  Get the current bounds of the graphic geometry."
  [this val]
  (aset this "bounds" val))

(defn bounds-dirty
  "Property.

  Member of BatchPart.

  The bounds dirty flag."
  [this]
  (-> this .-boundsDirty))

(defn set-bounds-dirty!
  "Property.

  Member of BatchPart.

  The bounds dirty flag."
  [this val]
  (aset this "boundsDirty" val))

(defn bounds-padding
  "Property.

  Member of BatchPart.

  Padding to add to the bounds."
  [this]
  (-> this .-boundsPadding))

(defn set-bounds-padding!
  "Property.

  Member of BatchPart.

  Padding to add to the bounds."
  [this val]
  (aset this "boundsPadding" val))

(defn cache-dirty
  "Property.

  Member of BatchPart.

  Used to check if the cache is dirty."
  [this]
  (-> this .-cacheDirty))

(defn set-cache-dirty!
  "Property.

  Member of BatchPart.

  Used to check if the cache is dirty."
  [this val]
  (aset this "cacheDirty" val))

(defn clear-dirty
  "Property.

  Member of BatchPart.

  Used to detect if we cleared the graphicsData."
  [this]
  (-> this .-clearDirty))

(defn set-clear-dirty!
  "Property.

  Member of BatchPart.

  Used to detect if we cleared the graphicsData."
  [this val]
  (aset this "clearDirty" val))

(defn close-point-eps
  "Property.

  Member of BatchPart.

  Minimal distance between points that are considered different.
  Affects line tesselation."
  [this]
  (-> this .-closePointEps))

(defn set-close-point-eps!
  "Property.

  Member of BatchPart.

  Minimal distance between points that are considered different.
  Affects line tesselation."
  [this val]
  (aset this "closePointEps" val))

(defn colors
  "Property.

  Member of BatchPart.

  The collection of colors"
  [this]
  (-> this .-colors))

(defn set-colors!
  "Property.

  Member of BatchPart.

  The collection of colors"
  [this val]
  (aset this "colors" val))

(defn dirty
  "Property.

  Member of BatchPart.

  Used to detect if the graphics object has changed."
  [this]
  (-> this .-dirty))

(defn set-dirty!
  "Property.

  Member of BatchPart.

  Used to detect if the graphics object has changed."
  [this val]
  (aset this "dirty" val))

(defn draw-calls
  "Property.

  Member of BatchPart.

  List of current draw calls drived from the batches."
  [this]
  (-> this .-drawCalls))

(defn set-draw-calls!
  "Property.

  Member of BatchPart.

  List of current draw calls drived from the batches."
  [this val]
  (aset this "drawCalls" val))

(defn graphics-data
  "Property.

  Member of BatchPart.

  The collection of drawn shapes."
  [this]
  (-> this .-graphicsData))

(defn set-graphics-data!
  "Property.

  Member of BatchPart.

  The collection of drawn shapes."
  [this val]
  (aset this "graphicsData" val))

(defn indices
  "Property.

  Member of BatchPart.

  The indices of the vertices"
  [this]
  (-> this .-indices))

(defn set-indices!
  "Property.

  Member of BatchPart.

  The indices of the vertices"
  [this val]
  (aset this "indices" val))

(defn points
  "Property.

  Member of BatchPart.

  An array of points to draw, 2 numbers per point"
  [this]
  (-> this .-points))

(defn set-points!
  "Property.

  Member of BatchPart.

  An array of points to draw, 2 numbers per point"
  [this val]
  (aset this "points" val))

(defn shape-index
  "Property.

  Member of BatchPart.

  Index of the last batched shape in the stack of calls."
  [this]
  (-> this .-shapeIndex))

(defn set-shape-index!
  "Property.

  Member of BatchPart.

  Index of the last batched shape in the stack of calls."
  [this val]
  (aset this "shapeIndex" val))

(defn texture-ids
  "Property.

  Member of BatchPart.

  Reference to the texture IDs."
  [this]
  (-> this .-textureIds))

(defn set-texture-ids!
  "Property.

  Member of BatchPart.

  Reference to the texture IDs."
  [this val]
  (aset this "textureIds" val))

(defn uvs
  "Property.

  Member of BatchPart.

  The UVs collection"
  [this]
  (-> this .-uvs))

(defn set-uvs!
  "Property.

  Member of BatchPart.

  The UVs collection"
  [this val]
  (aset this "uvs" val))

