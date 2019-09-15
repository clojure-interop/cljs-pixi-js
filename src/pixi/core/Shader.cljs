(ns pixi.core.Shader
  "A helper class for shaders"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/Shader))
  ([program]
    (new js/Shader program))
  ([program uniforms]
    (new js/Shader program uniforms)))

(defn *from
  "Method.

  Member of Shader.

  A short hand function to create a shader based of a vertex and
  shader"
  ([]
    (-> js/Shader (.from)))
  ([vertex-src]
    (-> js/Shader (.from vertex-src)))
  ([vertex-src fragment-src]
    (-> js/Shader (.from vertex-src fragment-src)))
  ([vertex-src fragment-src uniforms]
    (-> js/Shader (.from vertex-src fragment-src uniforms))))

(defn program
  "Property.

  Member of Shader.

  Program that the shader uses"
  [this]
  (-> this .-program))

(defn set-program!
  "Property.

  Member of Shader.

  Program that the shader uses"
  [this val]
  (aset this "program" val))

(defn uniforms
  "Property.

  Member of Shader.

  Shader uniform values, shortcut for `uniformGroup.uniforms`"
  [this]
  (-> this .-uniforms))

(defn set-uniforms!
  "Property.

  Member of Shader.

  Shader uniform values, shortcut for `uniformGroup.uniforms`"
  [this val]
  (aset this "uniforms" val))

