(ns pixi.SimpleRope
  "Extends - Mesh.

  The rope allows you to draw a texture across several points and
  manipulate these points
  ```js
  for (let i = 0; i < 20; i++) {
  points.push(new PIXI.Point(i * 50, 0));
  };
  let rope = new PIXI.SimpleRope(PIXI.Texture.from(\"snake.png\"),
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([texture points]
    (new js/SimpleRope texture points)))

(defn calculate-uvs
  "Method.

  Member of SimpleRope.

  Updates uv field based on from geometry uv's or batchUvs"
  ([this]
    (-> this (.calculateUvs))))

(defn calculate-vertices
  "Method.

  Member of SimpleRope.

  Updates vertexData field based on transform and vertices"
  ([this]
    (-> this (.calculateVertices))))

(defn contains-point
  "Method.

  Member of SimpleRope.

  Tests if a point is inside this mesh. Works only for PIXI.DRAW_MODES.TRIANGLES."
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of SimpleRope.

  Destroys the Mesh object."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn batchable-size
  "Property.

  Member of SimpleRope.

  The maximum number of vertices to consider batchable. Generally,
  complexity
  of the geometry."
  []
  (-> js/Mesh .-BATCHABLE_SIZE))

(defn set-batchable-size!
  "Property.

  Member of SimpleRope.

  The maximum number of vertices to consider batchable. Generally,
  complexity
  of the geometry."
  [val]
  (aset js/Mesh "BATCHABLE_SIZE" val))

(defn auto-update
  "Property.

  Member of SimpleRope.

  re-calculate vertices by rope points each frame"
  [this]
  (-> this .-autoUpdate))

(defn set-auto-update!
  "Property.

  Member of SimpleRope.

  re-calculate vertices by rope points each frame"
  [this val]
  (aset this "autoUpdate" val))

(defn batch-uvs
  "Property.

  Member of SimpleRope.

  Batched UV's are cached for atlas textures"
  [this]
  (-> this .-batchUvs))

(defn set-batch-uvs!
  "Property.

  Member of SimpleRope.

  Batched UV's are cached for atlas textures"
  [this val]
  (aset this "batchUvs" val))

(defn blend-mode
  "Property.

  Member of SimpleRope.

  The blend mode to be applied to the Mesh. Apply a value of
  `PIXI.BLEND_MODES.NORMAL` to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of SimpleRope.

  The blend mode to be applied to the Mesh. Apply a value of
  `PIXI.BLEND_MODES.NORMAL` to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn draw-mode
  "Property.

  Member of SimpleRope.

  The way the Mesh should be drawn, can be any of the {@link PIXI.DRAW_MODES}"
  [this]
  (-> this .-drawMode))

(defn set-draw-mode!
  "Property.

  Member of SimpleRope.

  The way the Mesh should be drawn, can be any of the {@link PIXI.DRAW_MODES}"
  [this val]
  (aset this "drawMode" val))

(defn geometry
  "Property.

  Member of SimpleRope.

  Includes vertex positions, face indices, normals, colors, UVs,
  custom attributes within buffers, reducing the cost of passing
  this data to the GPU. Can be shared between multiple Mesh objects."
  [this]
  (-> this .-geometry))

(defn set-geometry!
  "Property.

  Member of SimpleRope.

  Includes vertex positions, face indices, normals, colors, UVs,
  custom attributes within buffers, reducing the cost of passing
  this data to the GPU. Can be shared between multiple Mesh objects."
  [this val]
  (aset this "geometry" val))

(defn indices
  "Property.

  Member of SimpleRope.

  thease are used as easy access for batching"
  [this]
  (-> this .-indices))

(defn set-indices!
  "Property.

  Member of SimpleRope.

  thease are used as easy access for batching"
  [this val]
  (aset this "indices" val))

(defn material
  "Property.

  Member of SimpleRope.

  Alias for {@link PIXI.Mesh#shader}."
  [this]
  (-> this .-material))

(defn set-material!
  "Property.

  Member of SimpleRope.

  Alias for {@link PIXI.Mesh#shader}."
  [this val]
  (aset this "material" val))

(defn round-pixels
  "Property.

  Member of SimpleRope.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this]
  (-> this .-roundPixels))

(defn set-round-pixels!
  "Property.

  Member of SimpleRope.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this val]
  (aset this "roundPixels" val))

(defn shader
  "Property.

  Member of SimpleRope.

  Represents the vertex and fragment shaders that processes the
  and runs on the GPU.
  Can be shared between multiple Mesh objects."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of SimpleRope.

  Represents the vertex and fragment shaders that processes the
  and runs on the GPU.
  Can be shared between multiple Mesh objects."
  [this val]
  (aset this "shader" val))

(defn size
  "Property.

  Member of SimpleRope.

  How much of the geometry to draw, by default `0` renders everything."
  [this]
  (-> this .-size))

(defn set-size!
  "Property.

  Member of SimpleRope.

  How much of the geometry to draw, by default `0` renders everything."
  [this val]
  (aset this "size" val))

(defn start
  "Property.

  Member of SimpleRope.

  Typically the index of the IndexBuffer where to start drawing."
  [this]
  (-> this .-start))

(defn set-start!
  "Property.

  Member of SimpleRope.

  Typically the index of the IndexBuffer where to start drawing."
  [this val]
  (aset this "start" val))

(defn state
  "Property.

  Member of SimpleRope.

  Represents the WebGL state the Mesh required to render, excludes
  and geometry. E.g.,
  blend mode, culling, depth testing, direction of rendering triangles,
  etc."
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of SimpleRope.

  Represents the WebGL state the Mesh required to render, excludes
  and geometry. E.g.,
  blend mode, culling, depth testing, direction of rendering triangles,
  etc."
  [this val]
  (aset this "state" val))

(defn texture
  "Property.

  Member of SimpleRope.

  The texture that the Mesh uses."
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of SimpleRope.

  The texture that the Mesh uses."
  [this val]
  (aset this "texture" val))

(defn tint
  "Property.

  Member of SimpleRope.

  The multiply tint applied to the Mesh. This is a hex value. A
  of
  `0xFFFFFF` will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of SimpleRope.

  The multiply tint applied to the Mesh. This is a hex value. A
  of
  `0xFFFFFF` will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn uv-buffer
  "Property.

  Member of SimpleRope.

  To change mesh uv's, change its uvBuffer data and increment its"
  [this]
  (-> this .-uvBuffer))

(defn set-uv-buffer!
  "Property.

  Member of SimpleRope.

  To change mesh uv's, change its uvBuffer data and increment its"
  [this val]
  (aset this "uvBuffer" val))

(defn uvs
  "Property.

  Member of SimpleRope.

  thease are used as easy access for batching"
  [this]
  (-> this .-uvs))

(defn set-uvs!
  "Property.

  Member of SimpleRope.

  thease are used as easy access for batching"
  [this val]
  (aset this "uvs" val))

(defn vertex-data
  "Property.

  Member of SimpleRope.

  this is the caching layer used by the batcher"
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of SimpleRope.

  this is the caching layer used by the batcher"
  [this val]
  (aset this "vertexData" val))

(defn vertex-dirty
  "Property.

  Member of SimpleRope.

  If geometry is changed used to decide to re-transform
  the vertexData."
  [this]
  (-> this .-vertexDirty))

(defn set-vertex-dirty!
  "Property.

  Member of SimpleRope.

  If geometry is changed used to decide to re-transform
  the vertexData."
  [this val]
  (aset this "vertexDirty" val))

(defn vertices-buffer
  "Property.

  Member of SimpleRope.

  To change mesh vertices, change its uvBuffer data and increment
  _updateID.
  Incrementing _updateID is optional because most of Mesh objects
  it anyway."
  [this]
  (-> this .-verticesBuffer))

(defn set-vertices-buffer!
  "Property.

  Member of SimpleRope.

  To change mesh vertices, change its uvBuffer data and increment
  _updateID.
  Incrementing _updateID is optional because most of Mesh objects
  it anyway."
  [this val]
  (aset this "verticesBuffer" val))

