(ns pixi.core.FramebufferSystem
  "Extends - System.

  System plugin to the renderer to manage framebuffers."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/FramebufferSystem renderer)))

(defn bind
  "Method.

  Member of FramebufferSystem.

  Bind a framebuffer"
  ([this framebuffer]
    (-> this (.bind framebuffer)))
  ([this framebuffer frame]
    (-> this (.bind framebuffer frame))))

(defn clear
  "Method.

  Member of FramebufferSystem.

  Clear the color of the context"
  ([this r g b a]
    (-> this (.clear r g b a))))

(defn context-change
  "Method.

  Member of FramebufferSystem.

  Sets up the renderer context and necessary buffers."
  ([this]
    (-> this (.contextChange))))

(defn destroy
  "Method.

  Member of FramebufferSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn dispose-all
  "Method.

  Member of FramebufferSystem.

  Disposes all framebuffers, but not textures bound to them"
  ([this]
    (-> this (.disposeAll)))
  ([this context-lost]
    (-> this (.disposeAll context-lost))))

(defn dispose-framebuffer
  "Method.

  Member of FramebufferSystem.

  Disposes framebuffer"
  ([this framebuffer]
    (-> this (.disposeFramebuffer framebuffer)))
  ([this framebuffer context-lost]
    (-> this (.disposeFramebuffer framebuffer context-lost))))

(defn init-framebuffer
  "Method.

  Member of FramebufferSystem.

  Initialize framebuffer"
  ([this framebuffer]
    (-> this (.initFramebuffer framebuffer))))

(defn reset
  "Method.

  Member of FramebufferSystem.

  resets framebuffer stored state, binds screen framebuffer
  should be called before renderTexture reset()"
  ([this]
    (-> this (.reset))))

(defn resize-framebuffer
  "Method.

  Member of FramebufferSystem.

  Resize the framebuffer"
  ([this framebuffer]
    (-> this (.resizeFramebuffer framebuffer))))

(defn set-viewport
  "Method.

  Member of FramebufferSystem.

  Set the WebGLRenderingContext's viewport."
  ([this x y width height]
    (-> this (.setViewport x y width height))))

(defn update-framebuffer
  "Method.

  Member of FramebufferSystem.

  Update the framebuffer"
  ([this framebuffer]
    (-> this (.updateFramebuffer framebuffer))))

(defn managed-framebuffers
  "Property.

  Member of FramebufferSystem.

  A list of managed framebuffers"
  [this]
  (-> this .-managedFramebuffers))

(defn set-managed-framebuffers!
  "Property.

  Member of FramebufferSystem.

  A list of managed framebuffers"
  [this val]
  (aset this "managedFramebuffers" val))

(defn renderer
  "Property.

  Member of FramebufferSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of FramebufferSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn size
  "Property.

  Member of FramebufferSystem.

  Get the size of the current width and height. Returns object
  `width` and `height` values."
  [this]
  (-> this .-size))

(defn set-size!
  "Property.

  Member of FramebufferSystem.

  Get the size of the current width and height. Returns object
  `width` and `height` values."
  [this val]
  (aset this "size" val))

(defn unknown-framebuffer
  "Property.

  Member of FramebufferSystem.

  Framebuffer value that shows that we don't know what is bound"
  [this]
  (-> this .-unknownFramebuffer))

(defn set-unknown-framebuffer!
  "Property.

  Member of FramebufferSystem.

  Framebuffer value that shows that we don't know what is bound"
  [this val]
  (aset this "unknownFramebuffer" val))

