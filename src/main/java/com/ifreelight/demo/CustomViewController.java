/*
 *
 *  * Copyright 2002-2017 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.ifreelight.demo;

import com.github.yuebo.dyna.core.ViewContext;
import com.github.yuebo.dyna.form.AbstractFormViewController;
import com.github.yuebo.dyna.security.PermissionCheck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User: yuebo
 * Date: 2018/7/3
 * Time: 22:02
 */
@Controller
@PermissionCheck(name = "customView")
public class CustomViewController extends AbstractFormViewController {

    @GetMapping("/custom/customView")
    public String customView(Model model){
        ViewContext viewContext=init("customView",model);
        return VIEW_OUTPUT_SHOW;
    }
}
