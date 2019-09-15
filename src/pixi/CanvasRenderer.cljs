(ns pixi.CanvasRenderer
  "Extends - AbstractRenderer.

  The CanvasRenderer draws the scene and all its content onto a
  canvas.
  This renderer should be used for browsers that do not support
  Don't forget to add the CanvasRenderer.view to your DOM or you
  not see anything!"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/CanvasRenderer))
  ([options]
    (new js/CanvasRenderer options)))

(defn clear
  "Method.

  Member of CanvasRenderer.

  Clear the canvas of renderer."
  ([this]
    (-> this (.clear)))
  ([this clear-color]
    (-> this (.clear clear-color))))

(defn destroy
  "Method.

  Member of CanvasRenderer.

  Removes everything from the renderer and optionally removes the
  DOM element."
  ([this]
    (-> this (.destroy)))
  ([this remove-view]
    (-> this (.destroy remove-view))))

(defn invalidate-blend-mode
  "Method.

  Member of CanvasRenderer.

  Checks if blend mode has changed."
  ([this]
    (-> this (.invalidateBlendMode))))

(defn *register-plugin
  "Method.

  Member of CanvasRenderer.

  Adds a plugin to the renderer."
  ([plugin-name ctor]
    (-> js/CanvasRenderer (.registerPlugin plugin-name ctor))))

(defn render
  "Method.

  Member of CanvasRenderer.

  Renders the object to this canvas view"
  ([this display-object]
    (-> this (.render display-object)))
  ([this display-object render-texture]
    (-> this (.render display-object render-texture)))
  ([this display-object render-texture clear]
    (-> this (.render display-object render-texture clear)))
  ([this display-object render-texture clear transform]
    (-> this (.render display-object render-texture clear transform)))
  ([this display-object render-texture clear transform skip-update-transform]
    (-> this (.render display-object render-texture clear transform skip-update-transform))))

(defn resize
  "Method.

  Member of CanvasRenderer.

  Resizes the canvas view to the specified width and height."
  ([this screen-width screen-height]
    (-> this (.resize screen-width screen-height))))

(defn set-blend-mode
  "Method.

  Member of CanvasRenderer.

  Sets the blend mode of the renderer."
  ([this blend-mode]
    (-> this (.setBlendMode blend-mode)))
  ([this blend-mode ready-for-outer-blend]
    (-> this (.setBlendMode blend-mode ready-for-outer-blend))))

(defn blend-modes
  "Property.

  Member of CanvasRenderer.

  Tracks the blend modes useful for this renderer."
  [this]
  (-> this .-blendModes))

(defn set-blend-modes!
  "Property.

  Member of CanvasRenderer.

  Tracks the blend modes useful for this renderer."
  [this val]
  (aset this "blendModes" val))

(defn context
  "Property.

  Member of CanvasRenderer.

  The currently active canvas 2d context (could change with renderTextures)"
  [this]
  (-> this .-context))

(defn set-context!
  "Property.

  Member of CanvasRenderer.

  The currently active canvas 2d context (could change with renderTextures)"
  [this val]
  (aset this "context" val))

(defn mask-manager
  "Property.

  Member of CanvasRenderer.

  Instance of a CanvasMaskManager, handles masking when using the
  renderer."
  [this]
  (-> this .-maskManager))

(defn set-mask-manager!
  "Property.

  Member of CanvasRenderer.

  Instance of a CanvasMaskManager, handles masking when using the
  renderer."
  [this val]
  (aset this "maskManager" val))

(defn plugins
  "Property.

  Member of CanvasRenderer.

  Collection of installed plugins. These are included by default
  PIXI, but can be excluded
  by creating a custom build. Consult the README for more information
  creating custom
  builds and excluding plugins."
  [this]
  (-> this .-plugins))

(defn set-plugins!
  "Property.

  Member of CanvasRenderer.

  Collection of installed plugins. These are included by default
  PIXI, but can be excluded
  by creating a custom build. Consult the README for more information
  creating custom
  builds and excluding plugins."
  [this val]
  (aset this "plugins" val))

(defn refresh
  "Property.

  Member of CanvasRenderer.

  Boolean flag controlling canvas refresh."
  [this]
  (-> this .-refresh))

(defn set-refresh!
  "Property.

  Member of CanvasRenderer.

  Boolean flag controlling canvas refresh."
  [this val]
  (aset this "refresh" val))

(defn root-context
  "Property.

  Member of CanvasRenderer.

  The root canvas 2d context that everything is drawn with."
  [this]
  (-> this .-rootContext))

(defn set-root-context!
  "Property.

  Member of CanvasRenderer.

  The root canvas 2d context that everything is drawn with."
  [this val]
  (aset this "rootContext" val))

(defn smooth-property
  "Property.

  Member of CanvasRenderer.

  The canvas property used to set the canvas smoothing property."
  [this]
  (-> this .-smoothProperty))

(defn set-smooth-property!
  "Property.

  Member of CanvasRenderer.

  The canvas property used to set the canvas smoothing property."
  [this val]
  (aset this "smoothProperty" val))

