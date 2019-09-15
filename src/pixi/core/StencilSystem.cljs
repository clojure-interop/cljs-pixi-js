(ns pixi.core.StencilSystem
  "Extends - System.

  System plugin to the renderer to manage stencils (used for masks)."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/StencilSystem renderer)))

(defn destroy
  "Method.

  Member of StencilSystem.

  Destroys the mask stack."
  ([this]
    (-> this (.destroy))))

(defn pop-stencil
  "Method.

  Member of StencilSystem.

  Removes the last mask from the stencil stack. @alvin"
  ([this]
    (-> this (.popStencil))))

(defn push-stencil
  "Method.

  Member of StencilSystem.

  Applies the Mask and adds it to the current stencil stack. @alvin"
  ([this graphics]
    (-> this (.pushStencil graphics))))

(defn set-mask-stack
  "Method.

  Member of StencilSystem.

  Changes the mask stack that is used by this System."
  ([this stencil-mask-stack]
    (-> this (.setMaskStack stencil-mask-stack))))

(defn renderer
  "Property.

  Member of StencilSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of StencilSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn stencil-mask-stack
  "Property.

  Member of StencilSystem.

  The mask stack"
  [this]
  (-> this .-stencilMaskStack))

(defn set-stencil-mask-stack!
  "Property.

  Member of StencilSystem.

  The mask stack"
  [this val]
  (aset this "stencilMaskStack" val))

