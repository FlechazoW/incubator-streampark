/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.console.system.mapper;

import org.apache.streampark.console.system.entity.TeamMember;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

public interface TeamMemberMapper extends BaseMapper<TeamMember> {

    /**
     * delete role by user id
     *
     * @param userId user id
     * @return boolean
     */
    Boolean deleteByUserId(@Param("userId") Long userId);

    /**
     * delete user by role id
     *
     * @param roleId role id
     * @return boolean
     */
    Boolean deleteByRoleId(@Param("roleId") Long roleId);

    IPage<TeamMember> findUsers(Page<TeamMember> page, @Param("teamMember") TeamMember teamMember);

}
