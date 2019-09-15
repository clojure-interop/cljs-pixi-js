(ns pixi.core.UniformGroup
  "Uniform group holds uniform map and some ID's for work"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/UniformGroup))
  ([uniforms]
    (new js/UniformGroup uniforms))
  ([uniforms static]
    (new js/UniformGroup uniforms static)))

(defn dirty-id
  "Property.

  Member of UniformGroup.

  dirty version"
  [this]
  (-> this .-dirtyId))

(defn set-dirty-id!
  "Property.

  Member of UniformGroup.

  dirty version"
  [this val]
  (aset this "dirtyId" val))

(defn group
  "Property.

  Member of UniformGroup.

  Its a group and not a single uniforms"
  [this]
  (-> this .-group))

(defn set-group!
  "Property.

  Member of UniformGroup.

  Its a group and not a single uniforms"
  [this val]
  (aset this "group" val))

(defn id
  "Property.

  Member of UniformGroup.

  unique id"
  [this]
  (-> this .-id))

(defn set-id!
  "Property.

  Member of UniformGroup.

  unique id"
  [this val]
  (aset this "id" val))

(defn static
  "Property.

  Member of UniformGroup.

  Uniforms wont be changed after creation"
  [this]
  (-> this .-static))

(defn set-static!
  "Property.

  Member of UniformGroup.

  Uniforms wont be changed after creation"
  [this val]
  (aset this "static" val))

(defn uniforms
  "Property.

  Member of UniformGroup.

  uniform values"
  [this]
  (-> this .-uniforms))

(defn set-uniforms!
  "Property.

  Member of UniformGroup.

  uniform values"
  [this val]
  (aset this "uniforms" val))

