<#-- @formatter:off -->
<#include "../mcitems.ftl">
{
    "type": "minecraft:stonecutting",
    <#if data.group?has_content>"group": "${data.group}",</#if>
    "ingredient": {
        ${mappedMCItemToItemObjectJSON(data.stoneCuttingInputStack)}
    },
    "result": {
        ${mappedMCItemToItemObjectJSON(data.stoneCuttingReturnStack, "id")},
        "count": ${data.recipeRetstackSize}
    }
}
<#-- @formatter:on -->