(ns pixi.CanvasMaskManager
  "A set of functions used to handle masking.
  Sprite masking is not supported on the CanvasRenderer."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/CanvasMaskManager renderer)))

(defn destroy
  "Method.

  Member of CanvasMaskManager.

  Destroys this canvas mask manager."
  ([this]
    (-> this (.destroy))))

(defn pop-mask
  "Method.

  Member of CanvasMaskManager.

  Restores the current drawing context to the state it was before
  mask was applied."
  ([this renderer]
    (-> this (.popMask renderer))))

(defn push-mask
  "Method.

  Member of CanvasMaskManager.

  This method adds it to the current stack of masks."
  ([this mask-data]
    (-> this (.pushMask mask-data))))

(defn render-graphics-shape
  "Method.

  Member of CanvasMaskManager.

  Renders a PIXI.Graphics shape."
  ([this graphics]
    (-> this (.renderGraphicsShape graphics))))

