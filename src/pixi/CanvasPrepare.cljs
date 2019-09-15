(ns pixi.CanvasPrepare
  "Extends - BasePrepare.

  The prepare manager provides functionality to upload content
  the GPU.
  This cannot be done directly for Canvas like in WebGL, but the
  can be achieved by drawing
  textures to an offline canvas. This draw call will force the
  to be moved onto the GPU.
  An instance of this class is automatically created by default,
  can be found at `renderer.plugins.prepare`"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/CanvasPrepare renderer)))

(defn add
  "Method.

  Member of CanvasPrepare.

  Manually add an item to the uploading queue."
  ([this item]
    (-> this (.add item))))

(defn delayed-tick
  "Method.

  Member of CanvasPrepare.

  'bound' call for prepareItems()."
  ([this]
    (-> this (.delayedTick))))

(defn destroy
  "Method.

  Member of CanvasPrepare.

  Destroys the plugin, don't use after this."
  ([this]
    (-> this (.destroy))))

(defn prepare-items
  "Method.

  Member of CanvasPrepare.

  Actually prepare items. This is handled outside of the tick because
  will take a while
  and we do NOT want to block the current animation frame from"
  ([this]
    (-> this (.prepareItems))))

(defn register-find-hook
  "Method.

  Member of CanvasPrepare.

  Adds hooks for finding items."
  ([this add-hook]
    (-> this (.registerFindHook add-hook))))

(defn register-upload-hook
  "Method.

  Member of CanvasPrepare.

  Adds hooks for uploading items."
  ([this upload-hook]
    (-> this (.registerUploadHook upload-hook))))

(defn tick
  "Method.

  Member of CanvasPrepare.

  Handle tick update"
  ([this]
    (-> this (.tick))))

(defn upload
  "Method.

  Member of CanvasPrepare.

  Upload all the textures and graphics to the GPU."
  ([this item]
    (-> this (.upload item)))
  ([this item done]
    (-> this (.upload item done))))

(defn add-hooks
  "Property.

  Member of CanvasPrepare.

  Collection of additional hooks for finding assets."
  [this]
  (-> this .-addHooks))

(defn set-add-hooks!
  "Property.

  Member of CanvasPrepare.

  Collection of additional hooks for finding assets."
  [this val]
  (aset this "addHooks" val))

(defn canvas
  "Property.

  Member of CanvasPrepare.

  An offline canvas to render textures to"
  [this]
  (-> this .-canvas))

(defn set-canvas!
  "Property.

  Member of CanvasPrepare.

  An offline canvas to render textures to"
  [this val]
  (aset this "canvas" val))

(defn completes
  "Property.

  Member of CanvasPrepare.

  Callback to call after completed."
  [this]
  (-> this .-completes))

(defn set-completes!
  "Property.

  Member of CanvasPrepare.

  Callback to call after completed."
  [this val]
  (aset this "completes" val))

(defn ctx
  "Property.

  Member of CanvasPrepare.

  The context to the canvas"
  [this]
  (-> this .-ctx))

(defn set-ctx!
  "Property.

  Member of CanvasPrepare.

  The context to the canvas"
  [this val]
  (aset this "ctx" val))

(defn limiter
  "Property.

  Member of CanvasPrepare.

  The limiter to be used to control how quickly items are prepared."
  [this]
  (-> this .-limiter))

(defn set-limiter!
  "Property.

  Member of CanvasPrepare.

  The limiter to be used to control how quickly items are prepared."
  [this val]
  (aset this "limiter" val))

(defn queue
  "Property.

  Member of CanvasPrepare.

  Collection of items to uploads at once."
  [this]
  (-> this .-queue))

(defn set-queue!
  "Property.

  Member of CanvasPrepare.

  Collection of items to uploads at once."
  [this val]
  (aset this "queue" val))

(defn renderer
  "Property.

  Member of CanvasPrepare.

  Reference to the renderer."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of CanvasPrepare.

  Reference to the renderer."
  [this val]
  (aset this "renderer" val))

(defn ticking
  "Property.

  Member of CanvasPrepare.

  If prepare is ticking (running)."
  [this]
  (-> this .-ticking))

(defn set-ticking!
  "Property.

  Member of CanvasPrepare.

  If prepare is ticking (running)."
  [this val]
  (aset this "ticking" val))

(defn upload-hook-helper
  "Property.

  Member of CanvasPrepare.

  The only real difference between CanvasPrepare and Prepare is
  they pass
  to upload hooks. That different parameter is stored here."
  [this]
  (-> this .-uploadHookHelper))

(defn set-upload-hook-helper!
  "Property.

  Member of CanvasPrepare.

  The only real difference between CanvasPrepare and Prepare is
  they pass
  to upload hooks. That different parameter is stored here."
  [this val]
  (aset this "uploadHookHelper" val))

(defn upload-hooks
  "Property.

  Member of CanvasPrepare.

  Collection of additional hooks for processing assets."
  [this]
  (-> this .-uploadHooks))

(defn set-upload-hooks!
  "Property.

  Member of CanvasPrepare.

  Collection of additional hooks for processing assets."
  [this val]
  (aset this "uploadHooks" val))

