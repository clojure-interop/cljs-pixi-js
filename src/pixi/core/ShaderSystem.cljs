(ns pixi.core.ShaderSystem
  "Extends - System.

  System plugin to the renderer to manage shaders."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/ShaderSystem renderer)))

(defn bind
  "Method.

  Member of ShaderSystem.

  Changes the current shader to the one given in parameter"
  ([this shader dont-sync]
    (-> this (.bind shader dont-sync))))

(defn destroy
  "Method.

  Member of ShaderSystem.

  Destroys this System and removes all its textures"
  ([this]
    (-> this (.destroy))))

(defn generate-shader
  "Method.

  Member of ShaderSystem.

  Generates a glProgram version of the Shader provided."
  ([this shader]
    (-> this (.generateShader shader))))

(defn get-signature
  "Method.

  Member of ShaderSystem.

  Takes a uniform group and data and generates a unique signature
  them."
  ([this group uniform-data]
    (-> this (.getSignature group uniform-data))))

(defn getgl-program
  "Method.

  Member of ShaderSystem.

  Returns the underlying GLShade rof the currently bound shader.
  This can be handy for when you to have a little more control
  the setting of your uniforms."
  ([this]
    (-> this (.getglProgram))))

(defn reset
  "Method.

  Member of ShaderSystem.

  Resets ShaderSystem state, does not affect WebGL state"
  ([this]
    (-> this (.reset))))

(defn set-uniforms
  "Method.

  Member of ShaderSystem.

  Uploads the uniforms values to the currently bound shader."
  ([this uniforms]
    (-> this (.setUniforms uniforms))))

(defn sync-uniforms
  "Method.

  Member of ShaderSystem.

  Overrideable by the @pixi/unsafe-eval package to use static
  syncUnforms instead."
  ([this]
    (-> this (.syncUniforms))))

(defn system-check
  "Method.

  Member of ShaderSystem.

  Overrideable function by `@pixi/unsafe-eval` to silence
  throwing an error if platform doesn't support unsafe-evals."
  ([this]
    (-> this (.systemCheck))))

(defn cache
  "Property.

  Member of ShaderSystem.

  Cache to holds the generated functions. Stored against UniformObjects
  signature"
  [this]
  (-> this .-cache))

(defn set-cache!
  "Property.

  Member of ShaderSystem.

  Cache to holds the generated functions. Stored against UniformObjects
  signature"
  [this val]
  (aset this "cache" val))

(defn gl
  "Property.

  Member of ShaderSystem.

  The current WebGL rendering context"
  [this]
  (-> this .-gl))

(defn set-gl!
  "Property.

  Member of ShaderSystem.

  The current WebGL rendering context"
  [this val]
  (aset this "gl" val))

(defn renderer
  "Property.

  Member of ShaderSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of ShaderSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

