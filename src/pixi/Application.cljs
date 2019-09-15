(ns pixi.Application
  "Convenience class to create a new PIXI application.
  This class automatically creates the renderer, ticker and root"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/Application))
  ([options]
    (new js/Application options)))

(defn destroy
  "Method.

  Member of Application.

  Destroy and don't use after this."
  ([this]
    (-> this (.destroy)))
  ([this remove-view]
    (-> this (.destroy remove-view)))
  ([this remove-view stage-options]
    (-> this (.destroy remove-view stage-options))))

(defn *register-plugin
  "Method.

  Member of Application.

  Register a middleware plugin for the application"
  ([plugin]
    (-> js/Application (.registerPlugin plugin))))

(defn render
  "Method.

  Member of Application.

  Render the current stage."
  ([this]
    (-> this (.render))))

(defn renderer
  "Property.

  Member of Application.

  WebGL renderer if available, otherwise CanvasRenderer."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of Application.

  WebGL renderer if available, otherwise CanvasRenderer."
  [this val]
  (aset this "renderer" val))

(defn screen
  "Property.

  Member of Application.

  Reference to the renderer's screen rectangle. Its safe to use
  `filterArea` or `hitArea` for the whole screen."
  [this]
  (-> this .-screen))

(defn set-screen!
  "Property.

  Member of Application.

  Reference to the renderer's screen rectangle. Its safe to use
  `filterArea` or `hitArea` for the whole screen."
  [this val]
  (aset this "screen" val))

(defn stage
  "Property.

  Member of Application.

  The root display container that's rendered."
  [this]
  (-> this .-stage))

(defn set-stage!
  "Property.

  Member of Application.

  The root display container that's rendered."
  [this val]
  (aset this "stage" val))

(defn view
  "Property.

  Member of Application.

  Reference to the renderer's canvas element."
  [this]
  (-> this .-view))

(defn set-view!
  "Property.

  Member of Application.

  Reference to the renderer's canvas element."
  [this val]
  (aset this "view" val))

