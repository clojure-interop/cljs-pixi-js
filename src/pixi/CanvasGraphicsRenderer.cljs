(ns pixi.CanvasGraphicsRenderer
  "Renderer dedicated to drawing and batching graphics objects."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/CanvasGraphicsRenderer renderer)))

(defn destroy
  "Method.

  Member of CanvasGraphicsRenderer.

  destroy graphics object"
  ([this]
    (-> this (.destroy))))

(defn render
  "Method.

  Member of CanvasGraphicsRenderer.

  Renders a Graphics object to a canvas."
  ([this graphics]
    (-> this (.render graphics))))

(defn update-graphics-tint
  "Method.

  Member of CanvasGraphicsRenderer.

  Updates the tint of a graphics object"
  ([this graphics]
    (-> this (.updateGraphicsTint graphics))))

