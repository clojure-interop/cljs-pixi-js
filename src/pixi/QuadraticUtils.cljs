(ns pixi.QuadraticUtils
  "Utilities for quadratic curves"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/QuadraticUtils)))

(defn *curve-length
  "Method.

  Member of QuadraticUtils.

  Calculate length of quadratic curve"
  ([from-x from-y cp-x cp-y to-x to-y]
    (-> js/QuadraticUtils (.curveLength from-x from-y cp-x cp-y to-x to-y))))

(defn *curve-to
  "Method.

  Member of QuadraticUtils.

  Calculate the points for a quadratic bezier curve and then draws
  Based on: https://stackoverflow.com/questions/785097/how-do-i-implement-a-bezier-curve-in-c"
  ([cp-x cp-y to-x to-y points]
    (-> js/QuadraticUtils (.curveTo cp-x cp-y to-x to-y points))))

