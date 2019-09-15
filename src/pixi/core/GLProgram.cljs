(ns pixi.core.GLProgram
  "Helper class to create a WebGL Program"
  (:refer-clojure :exclude []))

(defn new
  "Constructor.

  Makes a new Pixi program"
  ([program uniform-data]
    (new js/GLProgram program uniform-data)))

(defn destroy
  "Method.

  Member of GLProgram.

  Destroys this program"
  ([this]
    (-> this (.destroy))))

(defn program
  "Property.

  Member of GLProgram.

  The shader program"
  [this]
  (-> this .-program))

(defn set-program!
  "Property.

  Member of GLProgram.

  The shader program"
  [this val]
  (aset this "program" val))

(defn uniform-data
  "Property.

  Member of GLProgram.

  holds the uniform data which contains uniform locations
  and current uniform values used for caching and preventing unneeded
  commands"
  [this]
  (-> this .-uniformData))

(defn set-uniform-data!
  "Property.

  Member of GLProgram.

  holds the uniform data which contains uniform locations
  and current uniform values used for caching and preventing unneeded
  commands"
  [this val]
  (aset this "uniformData" val))

(defn uniform-groups
  "Property.

  Member of GLProgram.

  uniformGroups holds the various upload functions for the shader.
  uniform group
  and program have a unique upload function generated."
  [this]
  (-> this .-uniformGroups))

(defn set-uniform-groups!
  "Property.

  Member of GLProgram.

  uniformGroups holds the various upload functions for the shader.
  uniform group
  and program have a unique upload function generated."
  [this val]
  (aset this "uniformGroups" val))

