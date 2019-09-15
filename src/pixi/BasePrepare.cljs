(ns pixi.BasePrepare
  "The prepare manager provides functionality to upload content
  the GPU.
  BasePrepare handles basic queuing functionality and is extended
  {@link PIXI.prepare.Prepare} and {@link PIXI.prepare.CanvasPrepare}
  to provide preparation capabilities specific to their respective"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/BasePrepare renderer)))

(defn add
  "Method.

  Member of BasePrepare.

  Manually add an item to the uploading queue."
  ([this item]
    (-> this (.add item))))

(defn delayed-tick
  "Method.

  Member of BasePrepare.

  'bound' call for prepareItems()."
  ([this]
    (-> this (.delayedTick))))

(defn destroy
  "Method.

  Member of BasePrepare.

  Destroys the plugin, don't use after this."
  ([this]
    (-> this (.destroy))))

(defn prepare-items
  "Method.

  Member of BasePrepare.

  Actually prepare items. This is handled outside of the tick because
  will take a while
  and we do NOT want to block the current animation frame from"
  ([this]
    (-> this (.prepareItems))))

(defn register-find-hook
  "Method.

  Member of BasePrepare.

  Adds hooks for finding items."
  ([this add-hook]
    (-> this (.registerFindHook add-hook))))

(defn register-upload-hook
  "Method.

  Member of BasePrepare.

  Adds hooks for uploading items."
  ([this upload-hook]
    (-> this (.registerUploadHook upload-hook))))

(defn tick
  "Method.

  Member of BasePrepare.

  Handle tick update"
  ([this]
    (-> this (.tick))))

(defn upload
  "Method.

  Member of BasePrepare.

  Upload all the textures and graphics to the GPU."
  ([this item]
    (-> this (.upload item)))
  ([this item done]
    (-> this (.upload item done))))

(defn add-hooks
  "Property.

  Member of BasePrepare.

  Collection of additional hooks for finding assets."
  [this]
  (-> this .-addHooks))

(defn set-add-hooks!
  "Property.

  Member of BasePrepare.

  Collection of additional hooks for finding assets."
  [this val]
  (aset this "addHooks" val))

(defn completes
  "Property.

  Member of BasePrepare.

  Callback to call after completed."
  [this]
  (-> this .-completes))

(defn set-completes!
  "Property.

  Member of BasePrepare.

  Callback to call after completed."
  [this val]
  (aset this "completes" val))

(defn limiter
  "Property.

  Member of BasePrepare.

  The limiter to be used to control how quickly items are prepared."
  [this]
  (-> this .-limiter))

(defn set-limiter!
  "Property.

  Member of BasePrepare.

  The limiter to be used to control how quickly items are prepared."
  [this val]
  (aset this "limiter" val))

(defn queue
  "Property.

  Member of BasePrepare.

  Collection of items to uploads at once."
  [this]
  (-> this .-queue))

(defn set-queue!
  "Property.

  Member of BasePrepare.

  Collection of items to uploads at once."
  [this val]
  (aset this "queue" val))

(defn renderer
  "Property.

  Member of BasePrepare.

  Reference to the renderer."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of BasePrepare.

  Reference to the renderer."
  [this val]
  (aset this "renderer" val))

(defn ticking
  "Property.

  Member of BasePrepare.

  If prepare is ticking (running)."
  [this]
  (-> this .-ticking))

(defn set-ticking!
  "Property.

  Member of BasePrepare.

  If prepare is ticking (running)."
  [this val]
  (aset this "ticking" val))

(defn upload-hook-helper
  "Property.

  Member of BasePrepare.

  The only real difference between CanvasPrepare and Prepare is
  they pass
  to upload hooks. That different parameter is stored here."
  [this]
  (-> this .-uploadHookHelper))

(defn set-upload-hook-helper!
  "Property.

  Member of BasePrepare.

  The only real difference between CanvasPrepare and Prepare is
  they pass
  to upload hooks. That different parameter is stored here."
  [this val]
  (aset this "uploadHookHelper" val))

(defn upload-hooks
  "Property.

  Member of BasePrepare.

  Collection of additional hooks for processing assets."
  [this]
  (-> this .-uploadHooks))

(defn set-upload-hooks!
  "Property.

  Member of BasePrepare.

  Collection of additional hooks for processing assets."
  [this val]
  (aset this "uploadHooks" val))

