# generator-kotlin-jackson

> jsoncodegen JSON to Kotlin code generator for Jackson.

Generates Kotlin data classes from jsoncodegen interfaces. They can be instantiated like this:

```kt
val myObject = MyObject(
  name = "Budapest",
  flag = true,
  count = 3.0
)
```

Number is mapped to Double.

Enums are mapped to Kotlin enums, arrays to Lists, maps will become Maps.

## Install

```
npm i -D jsoncodegen-generator-kotlin-jackson
```

## Use

Remember to use `com.fasterxml.jackson.module.kotlin.jacksonObjectMapper` rather than the regular `ObjectMapper`.

## Configure

Configuration can be put in jsoncodegen-generator-kotlin-jackson.config.js and passed to jsoncodegen in the config parameter:

```
jsoncodegen --generator java-jackson --config jsoncodegen-generator-kotlin-jackson.config.js ...
```

**jsoncodegen-generator-kotlin-jackson.config.js**

```js
module.exports = {
  package: 'com.example'
}
```

### `package?: string`

The name of the target package. All generated classes will be in this package. Example: `"com.example"`

## License

MIT

## History

1.0.0 Initial version.
