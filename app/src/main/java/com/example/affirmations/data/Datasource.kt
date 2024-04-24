/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.string.affirmation1_desc, R.drawable.image1, R.string.affirmation1_text),
            Affirmation(R.string.affirmation2, R.string.affirmation2_desc, R.drawable.image2, R.string.affirmation2_text),
            Affirmation(R.string.affirmation3, R.string.affirmation3_desc, R.drawable.image3, R.string.affirmation3_text),
            Affirmation(R.string.affirmation4, R.string.affirmation4_desc, R.drawable.image4, R.string.affirmation4_text),
            Affirmation(R.string.affirmation5, R.string.affirmation5_desc, R.drawable.image5, R.string.affirmation5_text),
            Affirmation(R.string.affirmation6, R.string.affirmation6_desc, R.drawable.image6, R.string.affirmation6_text),
            Affirmation(R.string.affirmation7, R.string.affirmation7_desc, R.drawable.image7, R.string.affirmation7_text),
            Affirmation(R.string.affirmation8, R.string.affirmation8_desc, R.drawable.image8, R.string.affirmation8_text),
            Affirmation(R.string.affirmation9, R.string.affirmation9_desc, R.drawable.image9, R.string.affirmation9_text),
            Affirmation(R.string.affirmation10, R.string.affirmation10_desc, R.drawable.image10, R.string.affirmation10_text),
            Affirmation(R.string.affirmation11, R.string.affirmation11_desc, R.drawable.image11, R.string.affirmation11_text),
            Affirmation(R.string.affirmation12, R.string.affirmation12_desc, R.drawable.image12, R.string.affirmation12_text),
            Affirmation(R.string.affirmation13, R.string.affirmation13_desc, R.drawable.image13, R.string.affirmation13_text),
            Affirmation(R.string.affirmation14, R.string.affirmation14_desc, R.drawable.image14, R.string.affirmation14_text),
            Affirmation(R.string.affirmation15, R.string.affirmation15_desc, R.drawable.image15, R.string.affirmation15_text),
            Affirmation(R.string.affirmation16, R.string.affirmation16_desc, R.drawable.image16, R.string.affirmation16_text),
            Affirmation(R.string.affirmation17, R.string.affirmation17_desc, R.drawable.image17, R.string.affirmation17_text),
            Affirmation(R.string.affirmation18, R.string.affirmation18_desc, R.drawable.image18, R.string.affirmation18_text),
            Affirmation(R.string.affirmation19, R.string.affirmation19_desc, R.drawable.image19, R.string.affirmation19_text),
            Affirmation(R.string.affirmation20, R.string.affirmation20_desc, R.drawable.image20, R.string.affirmation20_text),






            )

    }
}
