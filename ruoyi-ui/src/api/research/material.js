import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listMaterial(query) {
  return request({
    url: '/reserch/basic/Reserchmaterials/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getMaterial(materialId) {
  return request({
    url: '/reserch/basic/Reserchmaterials/' + materialId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addMaterial(data) {
  return request({
    url: '/reserch/basic/Reserchmaterials/save',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateMaterial(data) {
  return request({
    url: '/system/material',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delMaterial(MaterialId) {
  return request({
    url: '/system/material/' + MaterialId,
    method: 'delete'
  })
}
