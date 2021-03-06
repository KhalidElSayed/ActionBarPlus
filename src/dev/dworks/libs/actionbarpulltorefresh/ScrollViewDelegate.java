/*
 * Copyright 2013 Chris Banes
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

package dev.dworks.libs.actionbarpulltorefresh;

import android.view.View;
import android.widget.ScrollView;


public class ScrollViewDelegate extends PullToRefreshAttacher.ViewDelegate {

    public static final Class<ScrollView> SUPPORTED_VIEW_CLASS = ScrollView.class;

    @Override
    public boolean isScrolledToTop(View view) {
        return view.getScrollY() <= 0;
    }

	@Override
	public boolean isScrolledToBottom(View view) {
		return false;
	}
}
