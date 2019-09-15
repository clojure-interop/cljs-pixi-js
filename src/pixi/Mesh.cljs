(ns pixi.Mesh
  "Extends - Container.

  Base mesh class.
  This class empowers you to have maximum flexibility to render
  kind of WebGL visuals you can think of.
  This class assumes a certain level of WebGL knowledge.
  If you know a bit this should abstract enough away to make you
  easier!
  Pretty much ALL WebGL can be broken down into the following:
  - Geometry - The structure and data for the mesh. This can include
  from positions, uvs, normals, colors etc..
  - Shader - This is the shader that PixiJS will render the geometry
  (attributes in the shader must match the geometry)
  - State - This is the state of WebGL required to render the mesh.
  Through a combination of the above elements you can render anything
  want, 2D or 3D!"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([geometry shader]
    (new js/Mesh geometry shader))
  ([geometry shader state]
    (new js/Mesh geometry shader state))
  ([geometry shader state draw-mode]
    (new js/Mesh geometry shader state draw-mode)))

(defn add-child
  "Method.

  Member of Mesh.

  Adds one or more children to the container.
  Multiple items can be added like so: `myContainer.addChild(thingOne,
  thingThree)`"
  ([this child]
    (-> this (.addChild child))))

(defn add-child-at
  "Method.

  Member of Mesh.

  Adds a child to the container at a specified index. If the index
  out of bounds an error will be thrown"
  ([this child index]
    (-> this (.addChildAt child index))))

(defn calculate-bounds
  "Method.

  Member of Mesh.

  Recalculates the bounds of the container."
  ([this]
    (-> this (.calculateBounds))))

(defn calculate-uvs
  "Method.

  Member of Mesh.

  Updates uv field based on from geometry uv's or batchUvs"
  ([this]
    (-> this (.calculateUvs))))

(defn calculate-vertices
  "Method.

  Member of Mesh.

  Updates vertexData field based on transform and vertices"
  ([this]
    (-> this (.calculateVertices))))

(defn contains-point
  "Method.

  Member of Mesh.

  Tests if a point is inside this mesh. Works only for PIXI.DRAW_MODES.TRIANGLES."
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of Mesh.

  Destroys the Mesh object."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn get-child-at
  "Method.

  Member of Mesh.

  Returns the child at the specified index"
  ([this index]
    (-> this (.getChildAt index))))

(defn get-child-index
  "Method.

  Member of Mesh.

  Returns the index position of a child DisplayObject instance"
  ([this child]
    (-> this (.getChildIndex child))))

(defn on-children-change
  "Method.

  Member of Mesh.

  Overridable method that can be used by Container subclasses whenever
  children array is modified"
  ([this]
    (-> this (.onChildrenChange))))

(defn remove-child
  "Method.

  Member of Mesh.

  Removes one or more children from the container."
  ([this child]
    (-> this (.removeChild child))))

(defn remove-child-at
  "Method.

  Member of Mesh.

  Removes a child from the specified index position."
  ([this index]
    (-> this (.removeChildAt index))))

(defn remove-children
  "Method.

  Member of Mesh.

  Removes all children from this container that are within the
  and end indexes."
  ([this]
    (-> this (.removeChildren)))
  ([this begin-index]
    (-> this (.removeChildren begin-index)))
  ([this begin-index end-index]
    (-> this (.removeChildren begin-index end-index))))

(defn render
  "Method.

  Member of Mesh.

  Renders the object using the WebGL renderer"
  ([this renderer]
    (-> this (.render renderer))))

(defn render-advanced
  "Method.

  Member of Mesh.

  Render the object using the WebGL renderer and advanced features."
  ([this renderer]
    (-> this (.renderAdvanced renderer))))

(defn set-child-index
  "Method.

  Member of Mesh.

  Changes the position of an existing child in the display object"
  ([this child index]
    (-> this (.setChildIndex child index))))

(defn sort-children
  "Method.

  Member of Mesh.

  Sorts children by zIndex. Previous order is mantained for 2 children
  the same zIndex."
  ([this]
    (-> this (.sortChildren))))

(defn swap-children
  "Method.

  Member of Mesh.

  Swaps the position of 2 Display Objects within this container."
  ([this child child2]
    (-> this (.swapChildren child child2))))

(defn update-transform
  "Method.

  Member of Mesh.

  Updates the transform on all children of this container for rendering"
  ([this]
    (-> this (.updateTransform))))

(defn batchable-size
  "Property.

  Member of Mesh.

  The maximum number of vertices to consider batchable. Generally,
  complexity
  of the geometry."
  []
  (-> js/Mesh .-BATCHABLE_SIZE))

(defn set-batchable-size!
  "Property.

  Member of Mesh.

  The maximum number of vertices to consider batchable. Generally,
  complexity
  of the geometry."
  [val]
  (aset js/Mesh "BATCHABLE_SIZE" val))

(defn batch-uvs
  "Property.

  Member of Mesh.

  Batched UV's are cached for atlas textures"
  [this]
  (-> this .-batchUvs))

(defn set-batch-uvs!
  "Property.

  Member of Mesh.

  Batched UV's are cached for atlas textures"
  [this val]
  (aset this "batchUvs" val))

(defn blend-mode
  "Property.

  Member of Mesh.

  The blend mode to be applied to the Mesh. Apply a value of
  `PIXI.BLEND_MODES.NORMAL` to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of Mesh.

  The blend mode to be applied to the Mesh. Apply a value of
  `PIXI.BLEND_MODES.NORMAL` to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn children
  "Property.

  Member of Mesh.

  The array of children of this container."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of Mesh.

  The array of children of this container."
  [this val]
  (aset this "children" val))

(defn draw-mode
  "Property.

  Member of Mesh.

  The way the Mesh should be drawn, can be any of the {@link PIXI.DRAW_MODES}"
  [this]
  (-> this .-drawMode))

(defn set-draw-mode!
  "Property.

  Member of Mesh.

  The way the Mesh should be drawn, can be any of the {@link PIXI.DRAW_MODES}"
  [this val]
  (aset this "drawMode" val))

(defn geometry
  "Property.

  Member of Mesh.

  Includes vertex positions, face indices, normals, colors, UVs,
  custom attributes within buffers, reducing the cost of passing
  this data to the GPU. Can be shared between multiple Mesh objects."
  [this]
  (-> this .-geometry))

(defn set-geometry!
  "Property.

  Member of Mesh.

  Includes vertex positions, face indices, normals, colors, UVs,
  custom attributes within buffers, reducing the cost of passing
  this data to the GPU. Can be shared between multiple Mesh objects."
  [this val]
  (aset this "geometry" val))

(defn height
  "Property.

  Member of Mesh.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Mesh.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "height" val))

(defn indices
  "Property.

  Member of Mesh.

  thease are used as easy access for batching"
  [this]
  (-> this .-indices))

(defn set-indices!
  "Property.

  Member of Mesh.

  thease are used as easy access for batching"
  [this val]
  (aset this "indices" val))

(defn material
  "Property.

  Member of Mesh.

  Alias for {@link PIXI.Mesh#shader}."
  [this]
  (-> this .-material))

(defn set-material!
  "Property.

  Member of Mesh.

  Alias for {@link PIXI.Mesh#shader}."
  [this val]
  (aset this "material" val))

(defn round-pixels
  "Property.

  Member of Mesh.

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

  Member of Mesh.

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

  Member of Mesh.

  Represents the vertex and fragment shaders that processes the
  and runs on the GPU.
  Can be shared between multiple Mesh objects."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of Mesh.

  Represents the vertex and fragment shaders that processes the
  and runs on the GPU.
  Can be shared between multiple Mesh objects."
  [this val]
  (aset this "shader" val))

(defn size
  "Property.

  Member of Mesh.

  How much of the geometry to draw, by default `0` renders everything."
  [this]
  (-> this .-size))

(defn set-size!
  "Property.

  Member of Mesh.

  How much of the geometry to draw, by default `0` renders everything."
  [this val]
  (aset this "size" val))

(defn sort-dirty
  "Property.

  Member of Mesh.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this]
  (-> this .-sortDirty))

(defn set-sort-dirty!
  "Property.

  Member of Mesh.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this val]
  (aset this "sortDirty" val))

(defn sortable-children
  "Property.

  Member of Mesh.

  If set to true, the container will sort its children by zIndex
  when updateTransform() is called, or manually if sortChildren()
  called.
  This actually changes the order of elements in the array, so
  be treated
  as a basic solution that is not performant compared to other
  such as @link https://github.com/pixijs/pixi-display
  Also be aware of that this may not work nicely with the addChildAt()
  as the zIndex sorting may cause the child to automatically sorted
  another position."
  [this]
  (-> this .-sortableChildren))

(defn set-sortable-children!
  "Property.

  Member of Mesh.

  If set to true, the container will sort its children by zIndex
  when updateTransform() is called, or manually if sortChildren()
  called.
  This actually changes the order of elements in the array, so
  be treated
  as a basic solution that is not performant compared to other
  such as @link https://github.com/pixijs/pixi-display
  Also be aware of that this may not work nicely with the addChildAt()
  as the zIndex sorting may cause the child to automatically sorted
  another position."
  [this val]
  (aset this "sortableChildren" val))

(defn start
  "Property.

  Member of Mesh.

  Typically the index of the IndexBuffer where to start drawing."
  [this]
  (-> this .-start))

(defn set-start!
  "Property.

  Member of Mesh.

  Typically the index of the IndexBuffer where to start drawing."
  [this val]
  (aset this "start" val))

(defn state
  "Property.

  Member of Mesh.

  Represents the WebGL state the Mesh required to render, excludes
  and geometry. E.g.,
  blend mode, culling, depth testing, direction of rendering triangles,
  etc."
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of Mesh.

  Represents the WebGL state the Mesh required to render, excludes
  and geometry. E.g.,
  blend mode, culling, depth testing, direction of rendering triangles,
  etc."
  [this val]
  (aset this "state" val))

(defn texture
  "Property.

  Member of Mesh.

  The texture that the Mesh uses."
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of Mesh.

  The texture that the Mesh uses."
  [this val]
  (aset this "texture" val))

(defn tint
  "Property.

  Member of Mesh.

  The multiply tint applied to the Mesh. This is a hex value. A
  of
  `0xFFFFFF` will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of Mesh.

  The multiply tint applied to the Mesh. This is a hex value. A
  of
  `0xFFFFFF` will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn uv-buffer
  "Property.

  Member of Mesh.

  To change mesh uv's, change its uvBuffer data and increment its"
  [this]
  (-> this .-uvBuffer))

(defn set-uv-buffer!
  "Property.

  Member of Mesh.

  To change mesh uv's, change its uvBuffer data and increment its"
  [this val]
  (aset this "uvBuffer" val))

(defn uvs
  "Property.

  Member of Mesh.

  thease are used as easy access for batching"
  [this]
  (-> this .-uvs))

(defn set-uvs!
  "Property.

  Member of Mesh.

  thease are used as easy access for batching"
  [this val]
  (aset this "uvs" val))

(defn vertex-data
  "Property.

  Member of Mesh.

  this is the caching layer used by the batcher"
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of Mesh.

  this is the caching layer used by the batcher"
  [this val]
  (aset this "vertexData" val))

(defn vertex-dirty
  "Property.

  Member of Mesh.

  If geometry is changed used to decide to re-transform
  the vertexData."
  [this]
  (-> this .-vertexDirty))

(defn set-vertex-dirty!
  "Property.

  Member of Mesh.

  If geometry is changed used to decide to re-transform
  the vertexData."
  [this val]
  (aset this "vertexDirty" val))

(defn vertices-buffer
  "Property.

  Member of Mesh.

  To change mesh vertices, change its uvBuffer data and increment
  _updateID.
  Incrementing _updateID is optional because most of Mesh objects
  it anyway."
  [this]
  (-> this .-verticesBuffer))

(defn set-vertices-buffer!
  "Property.

  Member of Mesh.

  To change mesh vertices, change its uvBuffer data and increment
  _updateID.
  Incrementing _updateID is optional because most of Mesh objects
  it anyway."
  [this val]
  (aset this "verticesBuffer" val))

(defn width
  "Property.

  Member of Mesh.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Mesh.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "width" val))

