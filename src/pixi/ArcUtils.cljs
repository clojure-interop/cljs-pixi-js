(ns pixi.ArcUtils
  "Utilities for arc curves"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/ArcUtils)))

(defn *arc
  "Method.

  Member of ArcUtils.

  The arc method creates an arc/curve (used to create circles,
  parts of circles)."
  ([start-x start-y cx cy radius start-angle end-angle anticlockwise points]
    (-> js/ArcUtils (.arc start-x start-y cx cy radius start-angle end-angle anticlockwise points))))

(defn *curve-to
  "Method.

  Member of ArcUtils.

  The arcTo() method creates an arc/curve between two tangents
  the canvas.
  \"borrowed\" from https://code.google.com/p/fxcanvas/ - thanks"
  ([x1 y1 x2 y2 radius]
    (-> js/ArcUtils (.curveTo x1 y1 x2 y2 radius))))

