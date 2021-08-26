package com.willfp.ecoskills.config

import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.core.config.yaml.YamlBaseConfig

class DataYml(
    plugin: EcoPlugin
): YamlBaseConfig(
    "data",
    false,
    plugin
)