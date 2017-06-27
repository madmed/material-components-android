/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.design.testapp.backlayer;

import android.os.Bundle;
import android.support.design.backlayer.BackLayerLayout;
import android.support.design.testapp.base.BaseTestActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Activity to test BackLayerLayout.
 */
public class BackLayerLayoutActivity extends BaseTestActivity {

  Button exposeButton;
  BackLayerLayout backLayer;
  ImageView extraContent;

  @Override
  protected int getContentViewLayoutResId() {
    return R.layout.design_backlayer;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    backLayer = (BackLayerLayout) findViewById(R.id.backLayer);
    extraContent = (ImageView) findViewById(R.id.backLayerExtraContent);
    exposeButton = (Button) findViewById(R.id.backLayerExpandButton);
    exposeButton.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            if (backLayer.isExpanded()) {
              backLayer.collapse();
            } else {
              backLayer.expand();
            }
          }
        });
  }
}
