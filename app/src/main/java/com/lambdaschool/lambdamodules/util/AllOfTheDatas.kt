package com.lambdaschool.lambdamodules.util

import com.lambdaschool.lambdamodules.model.ModuleItem

/*
### Template for new entry ##########################################

ModuleItem(
    <week>.<day> ,
    "<Module Title>",
    "<Description>",
    "<Demo Package Name>",
    "<Demo Two Package Name>",
    "<Guided Project Package Name>",
    "<Demo Code GitHub Url>",
    "<Guided Project GitHub Url>"
),

#####################################################################
### Input types #####################################################

ModuleItem(
    lectureId: Double,
    title: String,
    description: String,
    demoPackageName: String,
    demoTwoPackage2Name: String,
    projectPackageName: String
    demoGitHubUrl: String,
    demoTwoGitHubUrl
    projectGitHubUrl: String
)

#####################################################################
### Example entry ###################################################

ModuleItem(
    1.1,
    "Git",
    "Learning how to use Version Control",
    "com.example.demo",
    "com.example.demo_two",
    "com.example.guided_project",
    "https://github.com/myUserName/demoCodeRepo",
    "https://github.com/myUserName/myGuidedProjectRepo/tree/first-last"
)

#####################################################################
### Empty entry (Copy/Paste) ########################################

ModuleItem(
    0.0,    // <week>.<day>
    "",     // "<Module Title>"
    "",     // "<Description>"
    "",     // "<Demo Package Name>"
    "",     // "<Demo Two Package Name>"
    "",     // "<Guided Project Package Name>"
    "",     // "<Demo Code GitHub URL>"
    "",     // "<Demo Two Code GitHub Url>"
    ""      // "<Guided Project GitHub Url>"
),

Note:   If you have nothing to enter in the field (for example, a
        GitHub Repo Url), use "" to declare it as empty, like in
        the above empty entry.

CONSTRAINING FACTOR:    The only requirement for entries, is that
                        when entering a module for a sprint challenge
                        the entry must contain the `string` value:

                            "Sprint Challenge"

                        so button text changes appropriately.

        Example entry for my Module Title field:

                "Sprint Challenge 1"

#####################################################################
*/


object AllOfTheDatas {

    val lectureData = arrayOf(
        ModuleItem(
            3.1,   // <week>.<day>
            "Layout Animations",     // "<Module Title>"
            "Learning how to use animations in applications",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/AnimatedLayoutDemoCode/",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub URL>"
        ),
        ModuleItem(
            2.5,    // <week>.<day>
            "Sprint Challenge 2",     // "<Module Title>"
            "Shopping List",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/VivekV95/AH_Sprint2",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            2.4,    // <week>.<day>
            "Notifications",     // "<Module Title>"
            "Learning how to apply basic notifications and how they function",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/NotificationDemoCode",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            2.3,    // <week>.<day>
            "Material Design",     // "<Module Title>"
            "Learning how material design can help with giving users a better experience",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/AND3_Journal/tree/5ce405d4c3ac95949c87fd4390c71758b627418e",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            2.2,    // <week>.<day>
            "Showing Lists",     // "<Module Title>"
            "Learning how to apply RecyclerView and CardView",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/AND3-RecyclerViewDemo",     // "<Demo Code GitHub URL>"
            "https://github.com/ChancePayne/AND3_Journal/tree/6002b6a3acf87acdbe99a3d44514bb0b045b21ff",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            2.1,    // <week>.<day>
            "Resources & Styles",     // "<Module Title>"
            "Learning how to modify colors, styles, themes, as well as understanding accessibility options",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/ResourcesDemo",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            1.5,    // <week>.<day>
            "Sprint Challenge 1",     // "<Module Title>"
            "Viewed Movie List",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/BL-CoderOvertime/intentDemo",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            1.4,    // <week>.<day>
            "App Structure",     // "<Module Title>"
            "Learning how to organize and structure projects using best practices",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/AppStructureDemo",     // "<Demo Code GitHub URL>"
            "",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            1.3,    // <week>.<day>
            "Intents",     // "<Module Title>"
            "Learning how to communicate between activities and other apps",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/ChancePayne/IntentsDemo",     // "<Demo Code GitHub URL>"
            "https://github.com/ChancePayne/AND3_Journal/tree/910c8a5bf5d65656f28fc028a11a5f795654d3d6",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            1.2,    // <week>.<day>
            "Activity Lifecycle",     // "<Module Title>"
            "Learning how Android apps take advantage of and use the AndroidOS activity lifecycle",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "",     // "<Demo Code GitHub URL>"
            "https://github.com/ChancePayne/MattsList/tree/6d120ef6c0209ee741f72341faedd3e747330565",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        ),

        ModuleItem(
            1.1,    // <week>.<day>
            "Git",     // "<Module Title>"
            "Learning how to use Version Control (VC) to track changes within your project",     // "<Description>"
            "",     // "<Demo Package Name>"
            "",     // "<Demo Two Package Name>"
            "",     // "<Guided Project Package Name>"
            "https://github.com/LambdaSchool/Android_Pets",     // "<Demo Code GitHub URL>"
            "https://github.com/ChancePayne/and3-git-tools-demo",     // "<Demo Two Code GitHub Url>"
            ""      // "<Guided Project GitHub Url>"
        )
    )
}
