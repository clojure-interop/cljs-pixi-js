(ns pixi.core.AbstractRenderer
  "Extends - EventEmitter.

  The AbstractRenderer is the base for a PixiJS Renderer. It is
  by the {@link PIXI.CanvasRenderer}
  and {@link PIXI.Renderer} which can be used for rendering a PixiJS"
  (:refer-clojure :exclude [type]))

(defn new
  "Constructor."
  ([system]
    (new js/AbstractRenderer system))
  ([system options]
    (new js/AbstractRenderer system options)))

(defn destroy
  "Method.

  Member of AbstractRenderer.

  Removes everything from the renderer and optionally removes the
  DOM element."
  ([this]
    (-> this (.destroy)))
  ([this remove-view]
    (-> this (.destroy remove-view))))

(defn generate-texture
  "Method.

  Member of AbstractRenderer.

  Useful function that returns a texture of the display object
  can then be used to create sprites
  This can be quite useful if your displayObject is complicated
  needs to be reused multiple times."
  ([this display-object scale-mode resolution]
    (-> this (.generateTexture display-object scale-mode resolution)))
  ([this display-object scale-mode resolution region]
    (-> this (.generateTexture display-object scale-mode resolution region))))

(defn init-plugins
  "Method.

  Member of AbstractRenderer.

  Initialize the plugins."
  ([this static-map]
    (-> this (.initPlugins static-map))))

(defn resize
  "Method.

  Member of AbstractRenderer.

  Resizes the screen and canvas to the specified width and height.
  Canvas dimensions are multiplied by resolution."
  ([this screen-width screen-height]
    (-> this (.resize screen-width screen-height))))

(defn auto-density
  "Property.

  Member of AbstractRenderer.

  Whether CSS dimensions of canvas view should be resized to screen
  automatically."
  [this]
  (-> this .-autoDensity))

(defn set-auto-density!
  "Property.

  Member of AbstractRenderer.

  Whether CSS dimensions of canvas view should be resized to screen
  automatically."
  [this val]
  (aset this "autoDensity" val))

(defn background-color
  "Property.

  Member of AbstractRenderer.

  The background color to fill if not transparent"
  [this]
  (-> this .-backgroundColor))

(defn set-background-color!
  "Property.

  Member of AbstractRenderer.

  The background color to fill if not transparent"
  [this val]
  (aset this "backgroundColor" val))

(defn clear-before-render
  "Property.

  Member of AbstractRenderer.

  This sets if the CanvasRenderer will clear the canvas or not
  the new render pass.
  If the scene is NOT transparent PixiJS will use a canvas sized
  operation every
  frame to set the canvas background color. If the scene is transparent
  will use clearRect
  to clear the canvas every frame. Disable this by setting this
  false. For example, if
  your game has a canvas filling background image you often don't
  this set."
  [this]
  (-> this .-clearBeforeRender))

(defn set-clear-before-render!
  "Property.

  Member of AbstractRenderer.

  This sets if the CanvasRenderer will clear the canvas or not
  the new render pass.
  If the scene is NOT transparent PixiJS will use a canvas sized
  operation every
  frame to set the canvas background color. If the scene is transparent
  will use clearRect
  to clear the canvas every frame. Disable this by setting this
  false. For example, if
  your game has a canvas filling background image you often don't
  this set."
  [this val]
  (aset this "clearBeforeRender" val))

(defn height
  "Property.

  Member of AbstractRenderer.

  Same as view.height, actual number of pixels in the canvas by"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of AbstractRenderer.

  Same as view.height, actual number of pixels in the canvas by"
  [this val]
  (aset this "height" val))

(defn options
  "Property.

  Member of AbstractRenderer.

  The supplied constructor options."
  [this]
  (-> this .-options))

(defn set-options!
  "Property.

  Member of AbstractRenderer.

  The supplied constructor options."
  [this val]
  (aset this "options" val))

(defn plugins
  "Property.

  Member of AbstractRenderer.

  Collection of plugins."
  [this]
  (-> this .-plugins))

(defn set-plugins!
  "Property.

  Member of AbstractRenderer.

  Collection of plugins."
  [this val]
  (aset this "plugins" val))

(defn preserve-drawing-buffer
  "Property.

  Member of AbstractRenderer.

  The value of the preserveDrawingBuffer flag affects whether or
  the contents of
  the stencil buffer is retained after rendering."
  [this]
  (-> this .-preserveDrawingBuffer))

(defn set-preserve-drawing-buffer!
  "Property.

  Member of AbstractRenderer.

  The value of the preserveDrawingBuffer flag affects whether or
  the contents of
  the stencil buffer is retained after rendering."
  [this val]
  (aset this "preserveDrawingBuffer" val))

(defn resolution
  "Property.

  Member of AbstractRenderer.

  The resolution / device pixel ratio of the renderer."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of AbstractRenderer.

  The resolution / device pixel ratio of the renderer."
  [this val]
  (aset this "resolution" val))

(defn screen
  "Property.

  Member of AbstractRenderer.

  Measurements of the screen. (0, 0, screenWidth, screenHeight).
  Its safe to use as filterArea or hitArea for the whole stage."
  [this]
  (-> this .-screen))

(defn set-screen!
  "Property.

  Member of AbstractRenderer.

  Measurements of the screen. (0, 0, screenWidth, screenHeight).
  Its safe to use as filterArea or hitArea for the whole stage."
  [this val]
  (aset this "screen" val))

(defn transparent
  "Property.

  Member of AbstractRenderer.

  Whether the render view is transparent."
  [this]
  (-> this .-transparent))

(defn set-transparent!
  "Property.

  Member of AbstractRenderer.

  Whether the render view is transparent."
  [this val]
  (aset this "transparent" val))

(defn type
  "Property.

  Member of AbstractRenderer.

  The type of the renderer."
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of AbstractRenderer.

  The type of the renderer."
  [this val]
  (aset this "type" val))

(defn view
  "Property.

  Member of AbstractRenderer.

  The canvas element that everything is drawn to."
  [this]
  (-> this .-view))

(defn set-view!
  "Property.

  Member of AbstractRenderer.

  The canvas element that everything is drawn to."
  [this val]
  (aset this "view" val))

(defn width
  "Property.

  Member of AbstractRenderer.

  Same as view.width, actual number of pixels in the canvas by"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of AbstractRenderer.

  Same as view.width, actual number of pixels in the canvas by"
  [this val]
  (aset this "width" val))

