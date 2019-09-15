(ns pixi.CanvasMeshRenderer
  "Renderer dedicated to meshes."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/CanvasMeshRenderer renderer)))

(defn destroy
  "Method.

  Member of CanvasMeshRenderer.

  destroy the the renderer."
  ([this]
    (-> this (.destroy))))

(defn render
  "Method.

  Member of CanvasMeshRenderer.

  Renders the Mesh"
  ([this mesh]
    (-> this (.render mesh))))

(defn render-mesh-flat
  "Method.

  Member of CanvasMeshRenderer.

  Renders a flat Mesh"
  ([this mesh]
    (-> this (.renderMeshFlat mesh))))

