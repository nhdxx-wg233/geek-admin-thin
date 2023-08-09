package com.social.convert;

import com.social.entity.SysRole;
import com.social.vo.SysRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SysRoleConvert {
	SysRoleConvert INSTANCE = Mappers.getMapper(SysRoleConvert.class);

	SysRoleVO convert(SysRole entity);

	SysRole convert(SysRoleVO vo);

	List<SysRoleVO> convertList(List<SysRole> list);

}
