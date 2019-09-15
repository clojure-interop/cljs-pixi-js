(ns pixi.Graphics
  "Extends - Container.

  The Graphics class contains methods used to draw primitive shapes
  as lines, circles and
  rectangles to the display, and to color and fill them.
  Note that because Graphics can share a GraphicsGeometry with
  instances,
  it is necessary to call `destroy()` to properly dereference the
  GraphicsGeometry and avoid a memory leak. Alternatively, keep
  the same
  Graphics instance and call `clear()` between redraws."
  (:refer-clojure :exclude [clone]))

(defn new
  "Constructor."
  ([]
    (new js/Graphics))
  ([geometry]
    (new js/Graphics geometry)))

(defn add-child
  "Method.

  Member of Graphics.

  Adds one or more children to the container.
  Multiple items can be added like so: `myContainer.addChild(thingOne,
  thingThree)`"
  ([this child]
    (-> this (.addChild child))))

(defn add-child-at
  "Method.

  Member of Graphics.

  Adds a child to the container at a specified index. If the index
  out of bounds an error will be thrown"
  ([this child index]
    (-> this (.addChildAt child index))))

(defn arc
  "Method.

  Member of Graphics.

  The arc method creates an arc/curve (used to create circles,
  parts of circles)."
  ([this cx cy radius start-angle end-angle]
    (-> this (.arc cx cy radius start-angle end-angle)))
  ([this cx cy radius start-angle end-angle anticlockwise]
    (-> this (.arc cx cy radius start-angle end-angle anticlockwise))))

(defn arc-to
  "Method.

  Member of Graphics.

  The arcTo() method creates an arc/curve between two tangents
  the canvas.
  \"borrowed\" from https://code.google.com/p/fxcanvas/ - thanks"
  ([this x1 y1 x2 y2 radius]
    (-> this (.arcTo x1 y1 x2 y2 radius))))

(defn begin-fill
  "Method.

  Member of Graphics.

  Specifies a simple one-color fill that subsequent calls to other
  methods
  (such as lineTo() or drawCircle()) use when drawing."
  ([this]
    (-> this (.beginFill)))
  ([this color]
    (-> this (.beginFill color)))
  ([this color alpha]
    (-> this (.beginFill color alpha))))

(defn begin-hole
  "Method.

  Member of Graphics.

  Begin adding holes to the last draw shape
  IMPORTANT: holes must be fully inside a shape to work
  Also weirdness ensues if holes overlap!
  Ellipses, Circles, Rectangles and Rounded Rectangles cannot be
  or host for holes in CanvasRenderer,
  please use `moveTo` `lineTo`, `quadraticCurveTo` if you rely
  pixi-legacy bundle."
  ([this]
    (-> this (.beginHole))))

(defn begin-texture-fill
  "Method.

  Member of Graphics.

  Begin the texture fill"
  ([this]
    (-> this (.beginTextureFill)))
  ([this options]
    (-> this (.beginTextureFill options))))

(defn bezier-curve-to
  "Method.

  Member of Graphics.

  Calculate the points for a bezier curve and then draws it."
  ([this cp-x cp-y cp-x2 cp-y2 to-x to-y]
    (-> this (.bezierCurveTo cp-x cp-y cp-x2 cp-y2 to-x to-y))))

(defn calculate-bounds
  "Method.

  Member of Graphics.

  Recalculates the bounds of the container."
  ([this]
    (-> this (.calculateBounds))))

(defn calculate-tints
  "Method.

  Member of Graphics.

  Recalcuate the tint by applying tin to batches using Graphics"
  ([this]
    (-> this (.calculateTints))))

(defn calculate-vertices
  "Method.

  Member of Graphics.

  If there's a transform update or a change to the shape of the
  geometry, recaculate the vertices."
  ([this]
    (-> this (.calculateVertices))))

(defn clear
  "Method.

  Member of Graphics.

  Clears the graphics that were drawn to this Graphics object,
  resets fill and line style settings."
  ([this]
    (-> this (.clear))))

(defn clone
  "Method.

  Member of Graphics.

  Creates a new Graphics object with the same values as this one.
  Note that the only the properties of the object are cloned, not
  transform (position,scale,etc)"
  ([this]
    (-> this (.clone))))

(defn close-path
  "Method.

  Member of Graphics.

  Closes the current path."
  ([this]
    (-> this (.closePath))))

(defn contains-point
  "Method.

  Member of Graphics.

  Tests if a point is inside this graphics object"
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of Graphics.

  Destroys the Graphics object."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn draw-circle
  "Method.

  Member of Graphics.

  Draws a circle."
  ([this x y radius]
    (-> this (.drawCircle x y radius))))

(defn draw-ellipse
  "Method.

  Member of Graphics.

  Draws an ellipse."
  ([this x y width height]
    (-> this (.drawEllipse x y width height))))

(defn draw-polygon
  "Method.

  Member of Graphics.

  Draws a polygon using the given path."
  ([this path]
    (-> this (.drawPolygon path))))

(defn draw-rect
  "Method.

  Member of Graphics.

  Draws a rectangle shape."
  ([this x y width height]
    (-> this (.drawRect x y width height))))

(defn draw-rounded-rect
  "Method.

  Member of Graphics.

  Draw a rectangle shape with rounded/beveled corners."
  ([this x y width height radius]
    (-> this (.drawRoundedRect x y width height radius))))

(defn draw-shape
  "Method.

  Member of Graphics.

  Draw any shape."
  ([this shape]
    (-> this (.drawShape shape))))

(defn draw-star
  "Method.

  Member of Graphics.

  Draw a star shape with an arbitrary number of points."
  ([this x y points radius]
    (-> this (.drawStar x y points radius)))
  ([this x y points radius inner-radius]
    (-> this (.drawStar x y points radius inner-radius)))
  ([this x y points radius inner-radius rotation]
    (-> this (.drawStar x y points radius inner-radius rotation))))

(defn end-fill
  "Method.

  Member of Graphics.

  Applies a fill to the lines and shapes that were added since
  last call to the beginFill() method."
  ([this]
    (-> this (.endFill))))

(defn end-hole
  "Method.

  Member of Graphics.

  End adding holes to the last draw shape"
  ([this]
    (-> this (.endHole))))

(defn finish-poly
  "Method.

  Member of Graphics.

  Finish the polygon object."
  ([this]
    (-> this (.finishPoly))))

(defn get-child-at
  "Method.

  Member of Graphics.

  Returns the child at the specified index"
  ([this index]
    (-> this (.getChildAt index))))

(defn get-child-index
  "Method.

  Member of Graphics.

  Returns the index position of a child DisplayObject instance"
  ([this child]
    (-> this (.getChildIndex child))))

(defn is-fast-rect
  "Method.

  Member of Graphics.

  True if graphics consists of one rectangle, and thus, can be
  like a Sprite and
  masked with gl.scissor."
  ([this]
    (-> this (.isFastRect))))

(defn line-style
  "Method.

  Member of Graphics.

  Specifies the line style used for subsequent calls to Graphics
  such as the lineTo()
  method or the drawCircle() method."
  ([this]
    (-> this (.lineStyle))))

(defn line-texture-style
  "Method.

  Member of Graphics.

  Like line style but support texture for line fill."
  ([this]
    (-> this (.lineTextureStyle)))
  ([this options]
    (-> this (.lineTextureStyle options))))

(defn line-to
  "Method.

  Member of Graphics.

  Draws a line using the current line style from the current drawing
  to (x, y);
  The current drawing position is then set to (x, y)."
  ([this x y]
    (-> this (.lineTo x y))))

(defn move-to
  "Method.

  Member of Graphics.

  Moves the current drawing position to x, y."
  ([this x y]
    (-> this (.moveTo x y))))

(defn on-children-change
  "Method.

  Member of Graphics.

  Overridable method that can be used by Container subclasses whenever
  children array is modified"
  ([this]
    (-> this (.onChildrenChange))))

(defn quadratic-curve-to
  "Method.

  Member of Graphics.

  Calculate the points for a quadratic bezier curve and then draws
  Based on: https://stackoverflow.com/questions/785097/how-do-i-implement-a-bezier-curve-in-c"
  ([this cp-x cp-y to-x to-y]
    (-> this (.quadraticCurveTo cp-x cp-y to-x to-y))))

(defn remove-child
  "Method.

  Member of Graphics.

  Removes one or more children from the container."
  ([this child]
    (-> this (.removeChild child))))

(defn remove-child-at
  "Method.

  Member of Graphics.

  Removes a child from the specified index position."
  ([this index]
    (-> this (.removeChildAt index))))

(defn remove-children
  "Method.

  Member of Graphics.

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

  Member of Graphics.

  Renders the object using the WebGL renderer"
  ([this renderer]
    (-> this (.render renderer))))

(defn render-advanced
  "Method.

  Member of Graphics.

  Render the object using the WebGL renderer and advanced features."
  ([this renderer]
    (-> this (.renderAdvanced renderer))))

(defn set-child-index
  "Method.

  Member of Graphics.

  Changes the position of an existing child in the display object"
  ([this child index]
    (-> this (.setChildIndex child index))))

(defn set-matrix
  "Method.

  Member of Graphics.

  Apply a matrix to the positional data."
  ([this matrix]
    (-> this (.setMatrix matrix))))

(defn sort-children
  "Method.

  Member of Graphics.

  Sorts children by zIndex. Previous order is mantained for 2 children
  the same zIndex."
  ([this]
    (-> this (.sortChildren))))

(defn start-poly
  "Method.

  Member of Graphics.

  Start a polygon object internally"
  ([this]
    (-> this (.startPoly))))

(defn swap-children
  "Method.

  Member of Graphics.

  Swaps the position of 2 Display Objects within this container."
  ([this child child2]
    (-> this (.swapChildren child child2))))

(defn update-transform
  "Method.

  Member of Graphics.

  Updates the transform on all children of this container for rendering"
  ([this]
    (-> this (.updateTransform))))

(defn batch-tint
  "Property.

  Member of Graphics.

  Update dirty for limiting calculating tints for batches."
  [this]
  (-> this .-batchTint))

(defn set-batch-tint!
  "Property.

  Member of Graphics.

  Update dirty for limiting calculating tints for batches."
  [this val]
  (aset this "batchTint" val))

(defn batches
  "Property.

  Member of Graphics.

  A collections of batches! These can be drawn by the renderer
  system."
  [this]
  (-> this .-batches))

(defn set-batches!
  "Property.

  Member of Graphics.

  A collections of batches! These can be drawn by the renderer
  system."
  [this val]
  (aset this "batches" val))

(defn blend-mode
  "Property.

  Member of Graphics.

  The blend mode to be applied to the graphic shape. Apply a value
  `PIXI.BLEND_MODES.NORMAL` to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of Graphics.

  The blend mode to be applied to the graphic shape. Apply a value
  `PIXI.BLEND_MODES.NORMAL` to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn cache-as-bitmap
  "Property.

  Member of Graphics.

  When cacheAsBitmap is set to true the graphics object will be
  as if it was a sprite.
  This is useful if your graphics element does not change often,
  it will speed up the rendering
  of the object in exchange for taking up texture memory. It is
  useful if you need the graphics
  object to be anti-aliased, because it will be rendered using
  This is not recommended if
  you are constantly redrawing the graphics element."
  [this]
  (-> this .-cacheAsBitmap))

(defn set-cache-as-bitmap!
  "Property.

  Member of Graphics.

  When cacheAsBitmap is set to true the graphics object will be
  as if it was a sprite.
  This is useful if your graphics element does not change often,
  it will speed up the rendering
  of the object in exchange for taking up texture memory. It is
  useful if you need the graphics
  object to be anti-aliased, because it will be rendered using
  This is not recommended if
  you are constantly redrawing the graphics element."
  [this val]
  (aset this "cacheAsBitmap" val))

(defn children
  "Property.

  Member of Graphics.

  The array of children of this container."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of Graphics.

  The array of children of this container."
  [this val]
  (aset this "children" val))

(defn current-path
  "Property.

  Member of Graphics.

  Current path"
  [this]
  (-> this .-currentPath))

(defn set-current-path!
  "Property.

  Member of Graphics.

  Current path"
  [this val]
  (aset this "currentPath" val))

(defn fill
  "Property.

  Member of Graphics.

  The current fill style."
  [this]
  (-> this .-fill))

(defn set-fill!
  "Property.

  Member of Graphics.

  The current fill style."
  [this val]
  (aset this "fill" val))

(defn geometry
  "Property.

  Member of Graphics.

  Includes vertex positions, face indices, normals, colors, UVs,
  custom attributes within buffers, reducing the cost of passing
  this data to the GPU. Can be shared between multiple Mesh or
  objects."
  [this]
  (-> this .-geometry))

(defn set-geometry!
  "Property.

  Member of Graphics.

  Includes vertex positions, face indices, normals, colors, UVs,
  custom attributes within buffers, reducing the cost of passing
  this data to the GPU. Can be shared between multiple Mesh or
  objects."
  [this val]
  (aset this "geometry" val))

(defn height
  "Property.

  Member of Graphics.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Graphics.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "height" val))

(defn line
  "Property.

  Member of Graphics.

  The current line style."
  [this]
  (-> this .-line))

(defn set-line!
  "Property.

  Member of Graphics.

  The current line style."
  [this val]
  (aset this "line" val))

(defn plugin-name
  "Property.

  Member of Graphics.

  Renderer plugin for batching"
  [this]
  (-> this .-pluginName))

(defn set-plugin-name!
  "Property.

  Member of Graphics.

  Renderer plugin for batching"
  [this val]
  (aset this "pluginName" val))

(defn shader
  "Property.

  Member of Graphics.

  Represents the vertex and fragment shaders that processes the
  and runs on the GPU.
  Can be shared between multiple Graphics objects."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of Graphics.

  Represents the vertex and fragment shaders that processes the
  and runs on the GPU.
  Can be shared between multiple Graphics objects."
  [this val]
  (aset this "shader" val))

(defn sort-dirty
  "Property.

  Member of Graphics.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this]
  (-> this .-sortDirty))

(defn set-sort-dirty!
  "Property.

  Member of Graphics.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this val]
  (aset this "sortDirty" val))

(defn sortable-children
  "Property.

  Member of Graphics.

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

  Member of Graphics.

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

(defn state
  "Property.

  Member of Graphics.

  Represents the WebGL state the Graphics required to render, excludes
  and geometry. E.g.,
  blend mode, culling, depth testing, direction of rendering triangles,
  etc."
  [this]
  (-> this .-state))

(defn set-state!
  "Property.

  Member of Graphics.

  Represents the WebGL state the Graphics required to render, excludes
  and geometry. E.g.,
  blend mode, culling, depth testing, direction of rendering triangles,
  etc."
  [this val]
  (aset this "state" val))

(defn tint
  "Property.

  Member of Graphics.

  The tint applied to the graphic shape. This is a hex value. A
  of
  0xFFFFFF will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of Graphics.

  The tint applied to the graphic shape. This is a hex value. A
  of
  0xFFFFFF will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn vertex-data
  "Property.

  Member of Graphics.

  Copy of the object vertex data."
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of Graphics.

  Copy of the object vertex data."
  [this val]
  (aset this "vertexData" val))

(defn width
  "Property.

  Member of Graphics.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Graphics.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "width" val))

