// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.index;

import com.intellij.lang.javascript.psi.JSImplicitElementProvider;
import com.intellij.psi.stubs.StubIndexKey;
import org.angularjs.index.AngularIndexBase;
import org.jetbrains.annotations.NotNull;

public class Angular2TemplateUrlIndex extends AngularIndexBase {

  public static final StubIndexKey<String, JSImplicitElementProvider> KEY = StubIndexKey.createIndexKey("angular2.templateUrl.index");

  @NotNull
  @Override
  public StubIndexKey<String, JSImplicitElementProvider> getKey() {
    return KEY;
  }
}
