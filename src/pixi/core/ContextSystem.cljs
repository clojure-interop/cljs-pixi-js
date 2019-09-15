(ns pixi.core.ContextSystem
  "Extends - System.

  System plugin to the renderer to manage the context."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/ContextSystem renderer)))

(defn context-change
  "Method.

  Member of ContextSystem.

  Handle the context change event"
  ([this gl]
    (-> this (.contextChange gl))))

(defn create-context
  "Method.

  Member of ContextSystem.

  Helper class to create a WebGL Context"
  ([this canvas options]
    (-> this (.createContext canvas options))))

(defn destroy
  "Method.

  Member of ContextSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn get-extensions
  "Method.

  Member of ContextSystem.

  Auto-populate the extensions"
  ([this]
    (-> this (.getExtensions))))

(defn handle-context-lost
  "Method.

  Member of ContextSystem.

  Handles a lost webgl context"
  ([this event]
    (-> this (.handleContextLost event))))

(defn handle-context-restored
  "Method.

  Member of ContextSystem.

  Handles a restored webgl context"
  ([this]
    (-> this (.handleContextRestored))))

(defn init-from-context
  "Method.

  Member of ContextSystem.

  Initialize the context"
  ([this gl]
    (-> this (.initFromContext gl))))

(defn init-from-options
  "Method.

  Member of ContextSystem.

  Initialize from context options"
  ([this options]
    (-> this (.initFromOptions options))))

(defn postrender
  "Method.

  Member of ContextSystem.

  Handle the post-render runner event"
  ([this]
    (-> this (.postrender))))

(defn validate-context
  "Method.

  Member of ContextSystem.

  Validate context"
  ([this gl]
    (-> this (.validateContext gl))))

(defn extensions
  "Property.

  Member of ContextSystem.

  Extensions being used"
  [this]
  (-> this .-extensions))

(defn set-extensions!
  "Property.

  Member of ContextSystem.

  Extensions being used"
  [this val]
  (aset this "extensions" val))

(defn is-lost
  "Property.

  Member of ContextSystem.

  `true` if the context is lost"
  [this]
  (-> this .-isLost))

(defn set-is-lost!
  "Property.

  Member of ContextSystem.

  `true` if the context is lost"
  [this val]
  (aset this "isLost" val))

(defn renderer
  "Property.

  Member of ContextSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of ContextSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn web-gl-version
  "Property.

  Member of ContextSystem.

  Either 1 or 2 to reflect the WebGL version being used"
  [this]
  (-> this .-webGLVersion))

(defn set-web-gl-version!
  "Property.

  Member of ContextSystem.

  Either 1 or 2 to reflect the WebGL version being used"
  [this val]
  (aset this "webGLVersion" val))

