(ns pixi.core.RenderTextureSystem
  "Extends - System.

  System plugin to the renderer to manage render textures.
  Should be added after FramebufferSystem"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/RenderTextureSystem renderer)))

(defn bind
  "Method.

  Member of RenderTextureSystem.

  Bind the current render texture"
  ([this]
    (-> this (.bind)))
  ([this render-texture]
    (-> this (.bind render-texture)))
  ([this render-texture source-frame]
    (-> this (.bind render-texture source-frame)))
  ([this render-texture source-frame destination-frame]
    (-> this (.bind render-texture source-frame destination-frame))))

(defn clear
  "Method.

  Member of RenderTextureSystem.

  Erases the render texture and fills the drawing area with a colour"
  ([this]
    (-> this (.clear)))
  ([this clear-color]
    (-> this (.clear clear-color))))

(defn destroy
  "Method.

  Member of RenderTextureSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn reset
  "Method.

  Member of RenderTextureSystem.

  Resets renderTexture state"
  ([this]
    (-> this (.reset))))

(defn clear-color
  "Property.

  Member of RenderTextureSystem.

  The clear background color as rgba"
  [this]
  (-> this .-clearColor))

(defn set-clear-color!
  "Property.

  Member of RenderTextureSystem.

  The clear background color as rgba"
  [this val]
  (aset this "clearColor" val))

(defn current
  "Property.

  Member of RenderTextureSystem.

  Render texture"
  [this]
  (-> this .-current))

(defn set-current!
  "Property.

  Member of RenderTextureSystem.

  Render texture"
  [this val]
  (aset this "current" val))

(defn default-mask-stack
  "Property.

  Member of RenderTextureSystem.

  List of masks for the StencilSystem"
  [this]
  (-> this .-defaultMaskStack))

(defn set-default-mask-stack!
  "Property.

  Member of RenderTextureSystem.

  List of masks for the StencilSystem"
  [this val]
  (aset this "defaultMaskStack" val))

(defn destination-frame
  "Property.

  Member of RenderTextureSystem.

  Destination frame"
  [this]
  (-> this .-destinationFrame))

(defn set-destination-frame!
  "Property.

  Member of RenderTextureSystem.

  Destination frame"
  [this val]
  (aset this "destinationFrame" val))

(defn renderer
  "Property.

  Member of RenderTextureSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of RenderTextureSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn source-frame
  "Property.

  Member of RenderTextureSystem.

  Source frame"
  [this]
  (-> this .-sourceFrame))

(defn set-source-frame!
  "Property.

  Member of RenderTextureSystem.

  Source frame"
  [this val]
  (aset this "sourceFrame" val))

