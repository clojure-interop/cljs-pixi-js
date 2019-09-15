(ns pixi.core.Framebuffer
  "Frame buffer used by the BaseRenderTexture"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([width height]
    (new js/Framebuffer width height)))

(defn add-color-texture
  "Method.

  Member of Framebuffer.

  Add texture to the colorTexture array"
  ([this]
    (-> this (.addColorTexture)))
  ([this index]
    (-> this (.addColorTexture index)))
  ([this index texture]
    (-> this (.addColorTexture index texture))))

(defn add-depth-texture
  "Method.

  Member of Framebuffer.

  Add a depth texture to the frame buffer"
  ([this]
    (-> this (.addDepthTexture)))
  ([this texture]
    (-> this (.addDepthTexture texture))))

(defn dispose
  "Method.

  Member of Framebuffer.

  disposes WebGL resources that are connected to this geometry"
  ([this]
    (-> this (.dispose))))

(defn enable-depth
  "Method.

  Member of Framebuffer.

  Enable depth on the frame buffer"
  ([this]
    (-> this (.enableDepth))))

(defn enable-stencil
  "Method.

  Member of Framebuffer.

  Enable stencil on the frame buffer"
  ([this]
    (-> this (.enableStencil))))

(defn resize
  "Method.

  Member of Framebuffer.

  Resize the frame buffer"
  ([this width height]
    (-> this (.resize width height))))

(defn color-texture
  "Property.

  Member of Framebuffer.

  Reference to the colorTexture."
  [this]
  (-> this .-colorTexture))

(defn set-color-texture!
  "Property.

  Member of Framebuffer.

  Reference to the colorTexture."
  [this val]
  (aset this "colorTexture" val))

