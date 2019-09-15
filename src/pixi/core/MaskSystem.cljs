(ns pixi.core.MaskSystem
  "Extends - System.

  System plugin to the renderer to manage masks."
  (:refer-clojure :exclude [pop]))

(defn new
  "Constructor."
  ([renderer]
    (new js/MaskSystem renderer)))

(defn destroy
  "Method.

  Member of MaskSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn pop
  "Method.

  Member of MaskSystem.

  Removes the last mask from the mask stack and doesn't return"
  ([this target mask-data]
    (-> this (.pop target mask-data))))

(defn pop-scissor-mask
  "Method.

  Member of MaskSystem.

  Pop scissor mask"
  ([this]
    (-> this (.popScissorMask))))

(defn pop-sprite-mask
  "Method.

  Member of MaskSystem.

  Removes the last filter from the filter stack and doesn't return"
  ([this]
    (-> this (.popSpriteMask))))

(defn pop-stencil-mask
  "Method.

  Member of MaskSystem.

  Removes the last filter from the filter stack and doesn't return"
  ([this]
    (-> this (.popStencilMask))))

(defn push
  "Method.

  Member of MaskSystem.

  Applies the Mask and adds it to the current filter stack."
  ([this target mask-data]
    (-> this (.push target mask-data))))

(defn push-scissor-mask
  "Method.

  Member of MaskSystem."
  ([this target mask-data]
    (-> this (.pushScissorMask target mask-data))))

(defn push-sprite-mask
  "Method.

  Member of MaskSystem.

  Applies the Mask and adds it to the current filter stack."
  ([this target mask-data]
    (-> this (.pushSpriteMask target mask-data))))

(defn push-stencil-mask
  "Method.

  Member of MaskSystem.

  Applies the Mask and adds it to the current filter stack."
  ([this mask-data]
    (-> this (.pushStencilMask mask-data))))

(defn alpha-mask-index
  "Property.

  Member of MaskSystem.

  Current index of alpha mask pool"
  [this]
  (-> this .-alphaMaskIndex))

(defn set-alpha-mask-index!
  "Property.

  Member of MaskSystem.

  Current index of alpha mask pool"
  [this val]
  (aset this "alphaMaskIndex" val))

(defn alpha-mask-pool
  "Property.

  Member of MaskSystem.

  Pool of used sprite mask filters"
  [this]
  (-> this .-alphaMaskPool))

(defn set-alpha-mask-pool!
  "Property.

  Member of MaskSystem.

  Pool of used sprite mask filters"
  [this val]
  (aset this "alphaMaskPool" val))

(defn enable-scissor
  "Property.

  Member of MaskSystem.

  Enable scissor"
  [this]
  (-> this .-enableScissor))

(defn set-enable-scissor!
  "Property.

  Member of MaskSystem.

  Enable scissor"
  [this val]
  (aset this "enableScissor" val))

(defn renderer
  "Property.

  Member of MaskSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of MaskSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn scissor
  "Property.

  Member of MaskSystem.

  `true` if current pushed masked is scissor"
  [this]
  (-> this .-scissor))

(defn set-scissor!
  "Property.

  Member of MaskSystem.

  `true` if current pushed masked is scissor"
  [this val]
  (aset this "scissor" val))

(defn scissor-data
  "Property.

  Member of MaskSystem.

  Mask data"
  [this]
  (-> this .-scissorData))

(defn set-scissor-data!
  "Property.

  Member of MaskSystem.

  Mask data"
  [this val]
  (aset this "scissorData" val))

(defn scissor-render-target
  "Property.

  Member of MaskSystem.

  Target to mask"
  [this]
  (-> this .-scissorRenderTarget))

(defn set-scissor-render-target!
  "Property.

  Member of MaskSystem.

  Target to mask"
  [this val]
  (aset this "scissorRenderTarget" val))

