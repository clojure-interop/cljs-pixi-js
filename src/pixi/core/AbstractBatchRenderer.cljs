(ns pixi.core.AbstractBatchRenderer
  "Extends - ObjectRenderer.

  Renderer dedicated to drawing and batching sprites.
  This is the default batch renderer. It buffers objects
  with texture-based geometries and renders them in
  batches. It uploads multiple textures to the GPU to
  reduce to the number of draw calls."
  (:refer-clojure :exclude [flush]))

(defn new
  "Constructor.

  This will hook onto the renderer's `contextChange`
  and `prerender` signals."
  ([renderer]
    (new js/AbstractBatchRenderer renderer)))

(defn context-change
  "Method.

  Member of AbstractBatchRenderer.

  Handles the `contextChange` signal.
  It calculates `this.MAX_TEXTURES` and allocating the
  packed-geometry object pool."
  ([this]
    (-> this (.contextChange))))

(defn destroy
  "Method.

  Member of AbstractBatchRenderer.

  Destroys this `AbstractBatchRenderer`. It cannot be used again."
  ([this]
    (-> this (.destroy))))

(defn flush
  "Method.

  Member of AbstractBatchRenderer.

  Renders the content _now_ and empties the current batch."
  ([this]
    (-> this (.flush))))

(defn get-attribute-buffer
  "Method.

  Member of AbstractBatchRenderer.

  Fetches an attribute buffer from `this._aBuffers` that
  can hold atleast `size` floats."
  ([this size]
    (-> this (.getAttributeBuffer size))))

(defn get-index-buffer
  "Method.

  Member of AbstractBatchRenderer.

  Fetches an index buffer from `this._iBuffers` that can
  has atleast `size` capacity."
  ([this size]
    (-> this (.getIndexBuffer size))))

(defn on-prerender
  "Method.

  Member of AbstractBatchRenderer.

  Handles the `prerender` signal.
  It ensures that flushes start from the first geometry
  object again."
  ([this]
    (-> this (.onPrerender))))

(defn pack-interleaved-geometry
  "Method.

  Member of AbstractBatchRenderer.

  Takes the four batching parameters of `element`, interleaves
  and pushes them into the batching attribute/index buffers given.
  It uses these properties: `vertexData` `uvs`, `textureId` and
  `indicies`. It also uses the \"tint\" of the base-texture, if
  present."
  ([this element attribute-buffer index-buffer a-index i-index]
    (-> this (.packInterleavedGeometry element attribute-buffer index-buffer a-index i-index))))

(defn render
  "Method.

  Member of AbstractBatchRenderer.

  Buffers the \"batchable\" object. It need not be rendered
  immediately."
  ([this]
    (-> this (.render))))

(defn start
  "Method.

  Member of AbstractBatchRenderer.

  Starts a new sprite batch."
  ([this]
    (-> this (.start))))

(defn stop
  "Method.

  Member of AbstractBatchRenderer.

  Stops and flushes the current batch."
  ([this]
    (-> this (.stop))))

(defn max-textures
  "Property.

  Member of AbstractBatchRenderer.

  Maximum number of textures that can be uploaded to
  the GPU under the current context. It is initialized
  properly in `this.contextChange`."
  [this]
  (-> this .-MAX_TEXTURES))

(defn set-max-textures!
  "Property.

  Member of AbstractBatchRenderer.

  Maximum number of textures that can be uploaded to
  the GPU under the current context. It is initialized
  properly in `this.contextChange`."
  [this val]
  (aset this "MAX_TEXTURES" val))

(defn geometry-class
  "Property.

  Member of AbstractBatchRenderer.

  The class that represents the geometry of objects
  that are going to be batched with this."
  [this]
  (-> this .-geometryClass))

(defn set-geometry-class!
  "Property.

  Member of AbstractBatchRenderer.

  The class that represents the geometry of objects
  that are going to be batched with this."
  [this val]
  (aset this "geometryClass" val))

(defn renderer
  "Property.

  Member of AbstractBatchRenderer.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of AbstractBatchRenderer.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn shader-generator
  "Property.

  Member of AbstractBatchRenderer.

  This is used to generate a shader that can
  color each vertex based on a `aTextureId`
  attribute that points to an texture in `uSampler`.
  This enables the objects with different textures
  to be drawn in the same draw call.
  You can customize your shader by creating your
  custom shader generator."
  [this]
  (-> this .-shaderGenerator))

(defn set-shader-generator!
  "Property.

  Member of AbstractBatchRenderer.

  This is used to generate a shader that can
  color each vertex based on a `aTextureId`
  attribute that points to an texture in `uSampler`.
  This enables the objects with different textures
  to be drawn in the same draw call.
  You can customize your shader by creating your
  custom shader generator."
  [this val]
  (aset this "shaderGenerator" val))

(defn size
  "Property.

  Member of AbstractBatchRenderer.

  The number of bufferable objects before a flush
  occurs automatically."
  [this]
  (-> this .-size))

(defn set-size!
  "Property.

  Member of AbstractBatchRenderer.

  The number of bufferable objects before a flush
  occurs automatically."
  [this val]
  (aset this "size" val))

(defn state
  "Property.

  Member of AbstractBatchRenderer.

  The WebGL state in which this renderer will work."
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of AbstractBatchRenderer.

  The WebGL state in which this renderer will work."
  [this val]
  (aset this "state" val))

(defn vertex-size
  "Property.

  Member of AbstractBatchRenderer.

  Size of data being buffered per vertex in the
  attribute buffers (in floats). By default, the
  batch-renderer plugin uses 6:
  | aVertexPosition | 2 |
  |-----------------|---|
  | aTextureCoords | 2 |
  | aColor | 1 |
  | aTextureId | 1 |"
  [this]
  (-> this .-vertexSize))

(defn set-vertex-size!
  "Property.

  Member of AbstractBatchRenderer.

  Size of data being buffered per vertex in the
  attribute buffers (in floats). By default, the
  batch-renderer plugin uses 6:
  | aVertexPosition | 2 |
  |-----------------|---|
  | aTextureCoords | 2 |
  | aColor | 1 |
  | aTextureId | 1 |"
  [this val]
  (aset this "vertexSize" val))

