package com.thirdlife.thirddonation.api.nft.dto.response;

import com.thirdlife.thirddonation.api.nft.dto.MessageInfoDto;
import com.thirdlife.thirddonation.common.model.response.BaseResponseBody;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.data.domain.Page;

/**
 * NFT 의 리스트를 반환합니다.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ApiModel("SaleMessage")
public class SalesMessageResponse extends BaseResponseBody {
    private Page<MessageInfoDto> data;
}
