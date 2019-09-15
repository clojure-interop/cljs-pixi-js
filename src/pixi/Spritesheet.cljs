(ns pixi.Spritesheet
  "Utility class for maintaining reference to a collection
  of Textures on a single Spritesheet.
  To access a sprite sheet from your code pass its JSON data file
  Pixi's loader:
  ```js
  PIXI.Loader.shared.add(\"images/spritesheet.json\").load(setup);
  function setup() {
  let sheet = PIXI.Loader.shared.resources[\"images/spritesheet.json\"].spritesheet;
  ...
  }
  ```
  With the `sheet.textures` you can create Sprite objects,`sheet.animations`
  be used to create an AnimatedSprite.
  Sprite sheets can be packed using tools like {@link https://codeandweb.com/texturepacker|TexturePacker},
  {@link https://renderhjs.net/shoebox/|Shoebox} or {@link https://github.com/krzysztof-o/spritesheet.js|Spritesheet.js}.
  Default anchor points (see {@link PIXI.Texture#defaultAnchor})
  grouping of animation sprites are currently only
  supported by TexturePacker."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([base-texture data]
    (new js/Spritesheet base-texture data))
  ([base-texture data resolution-filename]
    (new js/Spritesheet base-texture data resolution-filename)))

(defn destroy
  "Method.

  Member of Spritesheet.

  Destroy Spritesheet and don't use after this."
  ([this]
    (-> this (.destroy)))
  ([this destroy-base]
    (-> this (.destroy destroy-base))))

(defn parse
  "Method.

  Member of Spritesheet.

  Parser spritesheet from loaded data. This is done asynchronously
  to prevent creating too many Texture within a single process."
  ([this callback]
    (-> this (.parse callback))))

(defn batch-size
  "Property.

  Member of Spritesheet.

  The maximum number of Textures to build per process."
  []
  (-> js/Spritesheet .-BATCH_SIZE))

(defn set-batch-size!
  "Property.

  Member of Spritesheet.

  The maximum number of Textures to build per process."
  [val]
  (aset js/Spritesheet "BATCH_SIZE" val))

(defn animations
  "Property.

  Member of Spritesheet.

  A map containing the textures for each animation.
  Can be used to create an {@link PIXI.AnimatedSprite|AnimatedSprite}:
  ```js
  new PIXI.AnimatedSprite(sheet.animations[\"anim_name\"])
  ```"
  [this]
  (-> this .-animations))

(defn set-animations!
  "Property.

  Member of Spritesheet.

  A map containing the textures for each animation.
  Can be used to create an {@link PIXI.AnimatedSprite|AnimatedSprite}:
  ```js
  new PIXI.AnimatedSprite(sheet.animations[\"anim_name\"])
  ```"
  [this val]
  (aset this "animations" val))

(defn base-texture
  "Property.

  Member of Spritesheet.

  Reference to ths source texture"
  [this]
  (-> this .-baseTexture))

(defn set-base-texture!
  "Property.

  Member of Spritesheet.

  Reference to ths source texture"
  [this val]
  (aset this "baseTexture" val))

(defn data
  "Property.

  Member of Spritesheet.

  Reference to the original JSON data."
  [this]
  (-> this .-data))

(defn set-data!
  "Property.

  Member of Spritesheet.

  Reference to the original JSON data."
  [this val]
  (aset this "data" val))

(defn resolution
  "Property.

  Member of Spritesheet.

  The resolution of the spritesheet."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of Spritesheet.

  The resolution of the spritesheet."
  [this val]
  (aset this "resolution" val))

(defn textures
  "Property.

  Member of Spritesheet.

  A map containing all textures of the sprite sheet.
  Can be used to create a {@link PIXI.Sprite|Sprite}:
  ```js
  new PIXI.Sprite(sheet.textures[\"image.png\"]);
  ```"
  [this]
  (-> this .-textures))

(defn set-textures!
  "Property.

  Member of Spritesheet.

  A map containing all textures of the sprite sheet.
  Can be used to create a {@link PIXI.Sprite|Sprite}:
  ```js
  new PIXI.Sprite(sheet.textures[\"image.png\"]);
  ```"
  [this val]
  (aset this "textures" val))

