(ns pixi.core.Program
  "Helper class to create a shader program."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/Program))
  ([vertex-src]
    (new js/Program vertex-src))
  ([vertex-src fragment-src]
    (new js/Program vertex-src fragment-src))
  ([vertex-src fragment-src name]
    (new js/Program vertex-src fragment-src name)))

(defn extract-data
  "Method.

  Member of Program.

  Extracts the data for a buy creating a small test program
  or reading the src directly."
  ([this]
    (-> this (.extractData)))
  ([this vertex-src]
    (-> this (.extractData vertex-src)))
  ([this vertex-src fragment-src]
    (-> this (.extractData vertex-src fragment-src))))

(defn *from
  "Method.

  Member of Program.

  A short hand function to create a program based of a vertex and
  shader
  this method will also check to see if there is a cached program."
  ([]
    (-> js/Program (.from)))
  ([vertex-src]
    (-> js/Program (.from vertex-src)))
  ([vertex-src fragment-src]
    (-> js/Program (.from vertex-src fragment-src))))

(defn get-attribute-data
  "Method.

  Member of Program.

  returns the attribute data from the program"
  ([this]
    (-> this (.getAttributeData)))
  ([this program]
    (-> this (.getAttributeData program)))
  ([this program gl]
    (-> this (.getAttributeData program gl))))

(defn get-uniform-data
  "Method.

  Member of Program.

  returns the uniform data from the program"
  ([this]
    (-> this (.getUniformData)))
  ([this program]
    (-> this (.getUniformData program)))
  ([this program gl]
    (-> this (.getUniformData program gl))))

(defn default-fragment-src
  "Property.

  Member of Program.

  The default fragment shader source"
  []
  (-> js/Program .-defaultFragmentSrc))

(defn set-default-fragment-src!
  "Property.

  Member of Program.

  The default fragment shader source"
  [val]
  (aset js/Program "defaultFragmentSrc" val))

(defn default-vertex-src
  "Property.

  Member of Program.

  The default vertex shader source"
  []
  (-> js/Program .-defaultVertexSrc))

(defn set-default-vertex-src!
  "Property.

  Member of Program.

  The default vertex shader source"
  [val]
  (aset js/Program "defaultVertexSrc" val))

(defn fragment-src
  "Property.

  Member of Program.

  The fragment shader."
  [this]
  (-> this .-fragmentSrc))

(defn set-fragment-src!
  "Property.

  Member of Program.

  The fragment shader."
  [this val]
  (aset this "fragmentSrc" val))

(defn vertex-src
  "Property.

  Member of Program.

  The vertex shader."
  [this]
  (-> this .-vertexSrc))

(defn set-vertex-src!
  "Property.

  Member of Program.

  The vertex shader."
  [this val]
  (aset this "vertexSrc" val))

