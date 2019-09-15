(ns pixi.CanvasRenderTarget
  "Creates a Canvas element of the given size to be used as a target
  rendering to."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([width height]
    (new js/CanvasRenderTarget width height))
  ([width height resolution]
    (new js/CanvasRenderTarget width height resolution)))

(defn clear
  "Method.

  Member of CanvasRenderTarget.

  Clears the canvas that was created by the CanvasRenderTarget"
  ([this]
    (-> this (.clear))))

(defn destroy
  "Method.

  Member of CanvasRenderTarget.

  Destroys this canvas."
  ([this]
    (-> this (.destroy))))

(defn resize
  "Method.

  Member of CanvasRenderTarget.

  Resizes the canvas to the specified width and height."
  ([this width height]
    (-> this (.resize width height))))

(defn canvas
  "Property.

  Member of CanvasRenderTarget.

  The Canvas object that belongs to this CanvasRenderTarget."
  [this]
  (-> this .-canvas))

(defn set-canvas!
  "Property.

  Member of CanvasRenderTarget.

  The Canvas object that belongs to this CanvasRenderTarget."
  [this val]
  (aset this "canvas" val))

(defn context
  "Property.

  Member of CanvasRenderTarget.

  A CanvasRenderingContext2D object representing a two-dimensional
  context."
  [this]
  (-> this .-context))

(defn set-context!
  "Property.

  Member of CanvasRenderTarget.

  A CanvasRenderingContext2D object representing a two-dimensional
  context."
  [this val]
  (aset this "context" val))

(defn height
  "Property.

  Member of CanvasRenderTarget.

  The height of the canvas buffer in pixels."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of CanvasRenderTarget.

  The height of the canvas buffer in pixels."
  [this val]
  (aset this "height" val))

(defn width
  "Property.

  Member of CanvasRenderTarget.

  The width of the canvas buffer in pixels."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of CanvasRenderTarget.

  The width of the canvas buffer in pixels."
  [this val]
  (aset this "width" val))

