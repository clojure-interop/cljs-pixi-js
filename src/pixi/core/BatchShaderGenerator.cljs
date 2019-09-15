(ns pixi.core.BatchShaderGenerator
  "Helper that generates batching multi-texture shader. Use it with
  new BatchRenderer"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([vertex-src frag-template]
    (new js/BatchShaderGenerator vertex-src frag-template)))

(defn frag-template
  "Property.

  Member of BatchShaderGenerator.

  Reference to the fragement shader template. Must contain \"%count%\"
  \"%forloop%\"."
  [this]
  (-> this .-fragTemplate))

(defn set-frag-template!
  "Property.

  Member of BatchShaderGenerator.

  Reference to the fragement shader template. Must contain \"%count%\"
  \"%forloop%\"."
  [this val]
  (aset this "fragTemplate" val))

(defn vertex-src
  "Property.

  Member of BatchShaderGenerator.

  Reference to the vertex shader source."
  [this]
  (-> this .-vertexSrc))

(defn set-vertex-src!
  "Property.

  Member of BatchShaderGenerator.

  Reference to the vertex shader source."
  [this val]
  (aset this "vertexSrc" val))

