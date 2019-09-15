(ns pixi.BezierUtils
  "Utilities for bezier curves"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/BezierUtils)))

(defn *curve-length
  "Method.

  Member of BezierUtils.

  Calculate length of bezier curve.
  Analytical solution is impossible, since it involves an integral
  does not integrate in general.
  Therefore numerical solution is used."
  ([from-x from-y cp-x cp-y cp-x2 cp-y2 to-x to-y]
    (-> js/BezierUtils (.curveLength from-x from-y cp-x cp-y cp-x2 cp-y2 to-x to-y))))

(defn *curve-to
  "Method.

  Member of BezierUtils.

  Calculate the points for a bezier curve and then draws it.
  Ignored from docs since it is not directly exposed."
  ([cp-x cp-y cp-x2 cp-y2 to-x to-y points]
    (-> js/BezierUtils (.curveTo cp-x cp-y cp-x2 cp-y2 to-x to-y points))))

