package com.lambdaschool.lambdamodules.model

import java.io.Serializable

class ModuleItem (
    val lectureId: Double,
    val title: String,
    val description: String,
    val demoPackageName: String,
    val demoTwoPackageName: String,
    val projectPackageName: String,
    val demoGitHubUrl: String,
    val demoTwoGitHubUrl: String,
    val projectGitHubUrl: String
) : Serializable